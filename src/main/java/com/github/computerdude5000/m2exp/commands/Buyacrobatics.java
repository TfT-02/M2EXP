package com.github.computerdude5000.m2exp.commands;

import net.milkbowl.vault.economy.EconomyResponse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.computerdude5000.m2exp.M2EXP;


import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.McMMOPlayer;
import com.gmail.nossr50.datatypes.SkillType;


public class Buyacrobatics implements CommandExecutor{
	private M2EXP plugin;
	public SkillType ACROBATICS;
	public McMMOPlayer mcmmoplayer;
	
	
	public Buyacrobatics(M2EXP plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		try{
		if(cmd.getName().equalsIgnoreCase("bacrobatics")) {
		
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args[0].equals("info")){
						player.sendMessage("Buy Acrobatics EXP");
						player.sendMessage("Price for 5 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 10 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 20 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 50 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 100 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 200 Units is: " + " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Price for 300 Units is: "+ " and gives you: "+ " Exp of Acrobatics");
						player.sendMessage("Do /bacrobatics and the number of units IE: /bacrobatics 20");
				}
						else if (args[0].equals("5")){
								sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

								EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p5);
									
									if(r.transactionSuccess()) {
											sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u5, M2EXP.economy.format(r.balance)));
											ExperienceAPI.addRawXP(player, SkillType.ACROBATICS, plugin.u5);
											
								     } 
									 else {
										 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
									 }
									  return true;
						}
						else if(args[0].equals("10")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p10);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u10, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player, SkillType.ACROBATICS, plugin.u10);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						else if (args[0].equals("20")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p20);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u20, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player, SkillType.ACROBATICS, plugin.u20);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						else if (args[0].equals("50")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p50);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u50, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player,SkillType.ACROBATICS, plugin.u50);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						else if (args[0].equals("100")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p100);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u100, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player,SkillType.ACROBATICS, plugin.u100);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						else if (args[0].equals("200")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p200);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u200, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player, SkillType.ACROBATICS, plugin.u200);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						else if (args[0].equals("300")){
							sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

							EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p300);
								
								if(r.transactionSuccess()) {
										sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u300, M2EXP.economy.format(r.balance)));
										ExperienceAPI.addRawXP(player,SkillType.ACROBATICS, plugin.u300);
										
							     } 
								 else {
									 	sender.sendMessage(String.format("An error occured: %s", r.errorMessage));
								 }
								  return true;
							
						}
						
						
						else {
							player.sendMessage("please use a valid number 5,10,20,50,100,200,300");
						}
						return false;
						
						
						
						
						
						
						
			}
			else{
				System.out.println("Sorry you are not a player and you don't have access to this command");
			}
		}
		
	}catch (ArrayIndexOutOfBoundsException e){
			sender.sendMessage("please enter an argument like info,5,10,20,50,100,200,300 ");
		}
		return false;
	
	}
	

	
	}
	



