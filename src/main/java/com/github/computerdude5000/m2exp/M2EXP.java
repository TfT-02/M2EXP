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

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
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

import java.util.logging.Logger;



public class M2EXP extends JavaPlugin implements Listener {
	// do not change these
	
    public static Permission perms = null;
	
	 
	public final String chatprefix = "[M2EXP] ";
	public final String name = "M2EXP";
	public final String author = "Computerdude5000";
	public final String contact = "Computerdude5000@gmail.com or http://dev.bukkit.org/server-mods/money-2-exp/";
	public final String github = "https://github.com/computerdude5000/M2EXP";
	public final String info = name +" is a plugin that allows you to buy mcMMO exp to help you lvl up! ";
	
	
	
    public static Economy economy = null;
	// do not change these 
	public Logger logger = Logger.getLogger("M2EXP");
	
	//public int unitexp = this.getConfig().getInt("unit.exp");
	//public double unitprice = this.getConfig().getInt("unit.price");
	public int unitexp = 20;
	public int unitprice =10;
	
	public int u400 = unitexp*400;
	public double p400 = unitprice*400;
	
    public int u300 = unitexp*300;
	public double p300 = unitprice*300;
	
    public int u200 = unitexp*200;
	public double p200 = unitprice*200;
	
    public int u100 = unitexp*100;
	public double p100 = unitprice*100;
	
    public int u50 = unitexp*50;
	public double p50 = unitprice*50;
	
    public int u20 = unitexp*20;
	public double p20 = unitprice*20;
	
    public int u10 = unitexp*10;
	public double p10 = unitprice*10;
	
    public int u5 = unitexp*5;
	public double p5 = unitprice*5;
	

	

	
  
    public void onDisable() {
     	logger.info(chatprefix+"Goodbye!");
        
    }
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        economy = rsp.getProvider();
        return economy != null;
    }
    

    public void onEnable() {
    	
        if (!setupEconomy() ) {
            logger.severe( String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        else{
        getServer().getPluginManager().registerEvents(this, this);
        logger.info(chatprefix +" -------------Some Background info!--------------");
		logger.info(chatprefix + name + " a Plugin for MCMMO");
		logger.info(chatprefix +" By Computerdude5000");
		logger.info(chatprefix +" Feel free to email me any bugs at");
		logger.info(chatprefix +" Computerdude5000@gmail.com");
		logger.info(chatprefix+" or you can go to github.com/computerdude5000/Money2EXP and post a bug report their!");
		logger.info(chatprefix+" -------------lets get to the Plugin!-----------------");
		logger.info(chatprefix+" Hello!");
		logger.info(chatprefix+" This is just my message that I am starting to enable!");
		logger.info(chatprefix+" So lets get started shall we first I will preform a check to make sure you have MCMMO & Essentials");
		
		   
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
 
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Welcome, " + event.getPlayer().getDisplayName() + "!");
        event.getPlayer().sendMessage("M2EXP version 0.0.0.0.0.0.0.1 running!");
        event.getPlayer().sendMessage("Enjoy your stay on the server!!");
      
    }
    //@EventHandler 
    //public void onPlayerQuit (PlayerQuitEvent event){
    	///if (event.getPlayer().equals("Tmaster99999")){
    //		event.setQuitMessage("He came, He saw, He lagged out!!");
    //}
    	//else if (event.getPlayer().equals("Computerdude5000")){
    //		event.setQuitMessage("The main maker of M2EXP has just left the server!!!");
    		
    //	}
    	//else {
    		//event.setQuitMessage("goodbye");
    	//}
    
//}
}

