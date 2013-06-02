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

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.computerdude5000.m2exp.commands.Buyacrobatics;
import com.github.computerdude5000.m2exp.commands.Buyarchery;
import com.github.computerdude5000.m2exp.commands.Buyaxes;
import com.github.computerdude5000.m2exp.commands.Buyexcavation;
import com.github.computerdude5000.m2exp.commands.Buyfishing;
import com.github.computerdude5000.m2exp.commands.Buyherbalism;
import com.github.computerdude5000.m2exp.commands.Buymining;
import com.github.computerdude5000.m2exp.commands.Buyrepair;
import com.github.computerdude5000.m2exp.commands.Buyswords;
import com.github.computerdude5000.m2exp.commands.Buytaming;
import com.github.computerdude5000.m2exp.commands.Buyunarmed;
import com.github.computerdude5000.m2exp.commands.Buywoodcutting;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class M2EXP extends JavaPlugin implements Listener {

	public static Permission perms = null;

	public final String chatprefix = "[M2EXP] ";
	public final String name = "M2EXP";
	public final String author = "Computerdude5000";
	public final String contact = "Computerdude5000@gmail.com or http://dev.bukkit.org/server-mods/money-2-exp/";
	public final String github = "https://github.com/computerdude5000/M2EXP";
	public final String info = name	+ " is a plugin that allows you to buy mcMMO exp to help you lvl up! ";

	public static Economy economy = null;

	public Logger logger = Logger.getLogger("M2EXP");

	
	public void onDisable() {
		logger.info(chatprefix + "Goodbye!");

	}


	private boolean setupEconomy() {
		if (getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = getServer()
				.getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		economy = rsp.getProvider();
		return economy != null;
	}
    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }
	public void onEnable() {
        this.saveDefaultConfig();
        try
        {
            URL updateFile = new URL(
                    "https://dl.dropboxusercontent.com/s/fe61but0h82hkgs/m2exp.yml");
            InputStream is = updateFile.openStream();
            YamlConfiguration updates = YamlConfiguration.loadConfiguration(is);
            is.close();
            int latestVersion =  updates.getInt("update.version");
            if(latestVersion > 004){

            }

        } catch (MalformedURLException e)
        {
            logger.severe(String.valueOf(e));
        } catch (IOException e)
        {
            logger.severe(String.valueOf(e));
        }
		try {
			Metrics metrics = new Metrics(this);
			metrics.start();
		} catch (IOException e) {
			// Failed to submit the stats :-(
		}

		if (!setupEconomy()) {
			logger.severe(String.format(
					"[%s] - Disabled due to no Vault dependency found!",
					getDescription().getName()));
			getServer().getPluginManager().disablePlugin(this);
			return;
		} else {
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
	public ConfigurationSection getModuleConfig(String commandName) {
		return YamlConfiguration
				.loadConfiguration(new File(getDataFolder(), "config.yml"))
				.getConfigurationSection("skill")
				.getConfigurationSection(commandName);
	}

}
