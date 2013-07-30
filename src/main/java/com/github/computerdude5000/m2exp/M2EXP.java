/**
 * M2EXP - M2EXP.Java
 * Copyright (c) 2012 Computerdude5000, <computerdude5000@gmail.com>	
 *
 * M2EXP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or	
 * (at your option) any later version.
 *
 * M2EXP is distributed in the hope that it will be useful,	
 * but WITHOUT ANY WARRANTY; without even the implied warranty of	
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the	
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with M2EXP.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.computerdude5000.m2exp;

import com.github.computerdude5000.m2exp.commands.*;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class M2EXP extends JavaPlugin implements Listener
{

    public static Permission perms = null;
    public static Economy economy = null;

    public final String chatprefix = "[M2EXP] ";
    public final String name = "M2EXP";
    public final String author = "Computerdude5000";
    public final String contact = "Computerdude5000@gmail.com or http://dev.bukkit.org/server-mods/money-2-exp/";
    public final String github = "https://github.com/computerdude5000/M2EXP";
    public final String info = name + " is a plugin that allows you to buy mcMMO exp to help you lvl up! ";

    private boolean update = false;
    private String updateReason = "";
    private int latestVersion;
    private int exp_bought = 0;
    private int exp_sold = 0;
    private int money_lost = 0;
    private int money_gained = 0;

    public Logger logger = Logger.getLogger("M2EXP");


    public void onDisable()
    {
        logger.info(chatprefix + "Goodbye!");

    }

    private boolean setupEconomy()
    {
        if (getServer().getPluginManager().getPlugin("Vault") == null)
        {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer()
                .getServicesManager().getRegistration(Economy.class);
        if (rsp == null)
        {
            return false;
        }
        economy = rsp.getProvider();
        return economy != null;
    }

    private boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }

    public void onEnable()
    {
        this.saveDefaultConfig();
        if (this.getPluginConfig("update").getBoolean("check-for-update") == true)
        {
            try
            {
                URL updateFile = new URL(
                        "https://dl.dropboxusercontent.com/s/fe61but0h82hkgs/m2exp.yml");
                InputStream is = updateFile.openStream();
                YamlConfiguration updates = YamlConfiguration.loadConfiguration(is);
                is.close();
                latestVersion = updates.getInt("update.version");
                updateReason = updates.getString("update.reason");
                if (latestVersion > 10)
                {
                    update = true;
                    logger.info(chatprefix + "New update available version is " + latestVersion + " it can be found at http://dev.bukkit.org/bukkit-mods/money-2-exp/");
                    logger.info(updateReason);
                }

            } catch (MalformedURLException e)
            {
                logger.severe(String.valueOf(e));
            } catch (IOException e)
            {
                logger.severe(String.valueOf(e));
            }
        }
        try
        {
            Metrics metrics = new Metrics(this);
            // Plot the total amount of blocks broken
            metrics.addCustomData(new Metrics.Plotter("mcMMO exp bought")
            {

                @Override
                public int getValue()
                {

                    return exp_bought;
                }

            });
            // Plot the total amount of blocks broken
            metrics.addCustomData(new Metrics.Plotter("mcMMO exp sold")
            {

                @Override
                public int getValue()
                {
                    return exp_sold;
                }

            });
            // Plot the total amount of blocks broken
            metrics.addCustomData(new Metrics.Plotter("Money Lost")
            {

                @Override
                public int getValue()
                {
                    return money_lost;
                }

            });
            // Plot the total amount of blocks broken
            metrics.addCustomData(new Metrics.Plotter("Money Gained")
            {

                @Override
                public int getValue()
                {
                    return money_gained;
                }

            });

            metrics.start();
        } catch (IOException e)
        {
            // Failed to submit the stats :-(
        }

        if (!setupEconomy())
        {
            logger.severe(String.format(
                    "[%s] - Disabled due to no Vault dependency found!",
                    getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else
        {
            setupPermissions();
            getServer().getPluginManager().registerEvents(this, this);
            logger.info(chatprefix
                    + " -------------Some Background info!--------------");
            logger.info(chatprefix + name + " a Plugin for MCMMO");
            logger.info(chatprefix + " By Computerdude5000");
            logger.info(chatprefix + " Feel free to email me any bugs at");
            logger.info(chatprefix + " Computerdude5000@gmail.com");
            logger.info(chatprefix
                    + " or you can go to github.com/computerdude5000/Money2EXP and post a bug report there!");

            this.getCommand("bherbalism").setExecutor(new Buyherbalism(this));
            this.getCommand("bmining").setExecutor(new Buymining(this));
            this.getCommand("bfishing").setExecutor(new Buyfishing(this));
            this.getCommand("brepair").setExecutor(new Buyrepair(this));
            this.getCommand("bswords").setExecutor(new Buyswords(this));
            this.getCommand("btaming").setExecutor(new Buytaming(this));
            this.getCommand("bunarmed").setExecutor(new Buyunarmed(this));
            this.getCommand("bwoodcutting").setExecutor(new Buywoodcutting(this));
            this.getCommand("bexcavation").setExecutor(new Buyexcavation(this));
            this.getCommand("bacrobatics").setExecutor(new Buyacrobatics(this));
            this.getCommand("baxes").setExecutor(new Buyaxes(this));
            this.getCommand("barchery").setExecutor(new Buyarchery(this));

        }
    }

    /**
     * For command use: Get a ConfigurationSection in the root config.yml for the
     * module itself
     *
     * @param commandName Name of modules's section in config.yml
     * @return ConfigurationSection from root of config.yml
     */
    public ConfigurationSection getModuleConfig(String commandName)
    {
        return YamlConfiguration
                .loadConfiguration(new File(getDataFolder(), "config.yml"))
                .getConfigurationSection("skill")
                .getConfigurationSection(commandName);
    }

    private ConfigurationSection getPluginConfig(String name)
    {
        return YamlConfiguration
                .loadConfiguration(new File(getDataFolder(), "config.yml"))
                .getConfigurationSection("general")
                .getConfigurationSection(name);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        if (player.isOp() && update == true && getPluginConfig("update").getBoolean("notification") == true)
        {
            player.sendMessage("Hello " + player.getName().toString() + "! an update for M2EXP" + latestVersion + " you Should go and install it :D");
            player.sendMessage("it can be found at http://dev.bukkit.org/bukkit-mods/money-2-exp/");
        }
    }

    /**
     * returns the amount of exp bought in the transaction
     *
     * @return exp_bought
     */
    public int getExp_bought()
    {
        return exp_bought;
    }

    /**
     * sets the amount of exp bought in the transaction
     *
     * @param temp
     */
    public void setExp_bought(int temp)
    {
        this.exp_bought = this.exp_bought + temp;
    }

    /**
     * returns the amount of exp sold in the transaction
     *
     * @return
     */
    public int getExp_sold()
    {

        return exp_sold;
    }

    /**
     * sets the amount of exp sold in the transaction
     *
     * @param temp
     */
    public void setExp_sold(int temp)
    {
        this.exp_sold = this.exp_sold + temp;
    }

    /**
     * returns the amount of money the player lost in the transaction
     *
     * @return money_lost
     */
    public int getMoney_lost()
    {

        return money_lost;
    }

    /**
     * sets the amount of money the player lost in the transaction
     *
     * @param temp
     */
    public void setMoney_lost(int temp)
    {
        this.money_lost = this.money_lost + temp;
    }

    /**
     * returns the amount of money the plugin gained in the transaction
     *
     * @return money_gained
     */
    public int getMoney_gained()
    {
        return money_gained;
    }

    /**
     * sets the amount of money that the plugin gained from the transaction
     *
     * @param temp
     */
    public void setMoney_gained(int temp)
    {
        this.money_gained = this.money_gained + temp;
    }
}
