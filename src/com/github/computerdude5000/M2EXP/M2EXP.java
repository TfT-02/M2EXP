package com.github.computerdude5000.M2EXP;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.computerdude5000.M2EXP.commands.BacrobaticsCommand;
import com.github.computerdude5000.M2EXP.commands.BarcheryCommand;
import com.github.computerdude5000.M2EXP.commands.BaxesCommand;
import com.github.computerdude5000.M2EXP.commands.BexcavationCommand;
import com.github.computerdude5000.M2EXP.commands.BherbalismCommand;
import com.github.computerdude5000.M2EXP.commands.BminingCommand;
import com.github.computerdude5000.M2EXP.commands.BrepairCommand;
import com.github.computerdude5000.M2EXP.commands.BswordsCommand;
import com.github.computerdude5000.M2EXP.commands.BtamingCommand;
import com.github.computerdude5000.M2EXP.commands.BunarmedCommand;
import com.github.computerdude5000.M2EXP.commands.BwoodcuttingCommand;
import com.github.computerdude5000.M2EXP.commands.M2EXPCommand;


public class M2EXP extends JavaPlugin  {
	// do not change these
	public final String chatprefix = "[Money-2-EXP] ";
	public final String name = "Money-2-EXP";
	public final String author = "Computerdude5000";
	public final String contact = "Computerdude5000@gmail.com or http://dev.bukkit.org/server-mods/money-2-exp/";
	public final String github = "https://github.com/computerdude5000/Money-2-EXP";
	public final String info = name +" is a plugin that allows you to buy mcMMO exp to help you lvl up! ";
	
	// do not change these 
	public Logger logger = Logger.getLogger("Money-2-exp");
	
	public int unitexp = this.getConfig().getInt("unit.exp");
	public double unitprice = this.getConfig().getInt("unit.price");
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
	public static String Archery = "Archery";
	public String[] names = { "Acrobatics", "Archery", "Axes", "Excavation",
            "Herbalism", "Mining", "Repair", "Swords", "Taming", "Unarmed",
    "Woodcutting" };
  
	public void onDisable(){
    	logger.info(chatprefix+"Goodbye!");
		logger.info(chatprefix+"This is just my message that I am shutting down!");
		logger.info(chatprefix+"So let me get started first I will shut down my Sign Listeners!");
		logger.info(chatprefix+"Then I will shut down my command listeners!");
		logger.info(chatprefix+"Now to Shut down my mcmmo editors");
		logger.info(chatprefix+"then I will shut down the deductors");
		logger.info(chatprefix+"Screwing with your HardDrive!!");
		logger.info(chatprefix+"All Done!!! CYA next time!");
		logger.info(chatprefix+"Actually I don't want to Leave!!");
	}
	public void onEnable(){
		logger.info(chatprefix +" -------------Some Background info!--------------");
		logger.info(chatprefix + name + " a Plugin for MCMMO");
		logger.info(chatprefix +" By Computerdude5000");
		logger.info(chatprefix +" Feel free to email me any bugs at");
		logger.info(chatprefix +" Computerdude5000@gmail.com");
		logger.info(chatprefix+" or you can go to github.com/computerdude5000/Money2EXP and post a bug report their!");
		logger.info(chatprefix+" -------------lets get to the Plugin!-----------------");
		logger.info(chatprefix+" Hello!");
		logger.info(chatprefix+" This is just my message that I am starting to enable!");
		logger.info(chatprefix+" So lets get started shall we first I will preform a check to make sure you have MCMMO");
		
		
		getCommand("m2exp").setExecutor(new M2EXPCommand(this));
		getCommand("barchery").setExecutor(new BarcheryCommand(this));
		getCommand("baxes").setExecutor(new BaxesCommand(this));
		getCommand("bacrobatics").setExecutor(new BacrobaticsCommand(this));
		getCommand("bexcavation").setExecutor(new BexcavationCommand(this));
		getCommand("bherbalism").setExecutor(new BherbalismCommand(this));
		getCommand("bmining").setExecutor(new BminingCommand(this));
		getCommand("brepair").setExecutor(new BrepairCommand(this));
		getCommand("bswords").setExecutor(new BswordsCommand(this));
		getCommand("btaming").setExecutor(new BtamingCommand(this));
		getCommand("bunarmed").setExecutor(new BunarmedCommand(this));
		getCommand("bwoodcutting").setExecutor(new BwoodcuttingCommand(this));
	
		
	}
	
}

