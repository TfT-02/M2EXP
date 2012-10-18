/**	
 * M2EXP - Buytaming.java
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
package com.github.computerdude5000.m2exp.commands;

import net.milkbowl.vault.economy.EconomyResponse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.computerdude5000.m2exp.M2EXP;

import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.SkillType;

public class Buytaming implements CommandExecutor{
	private M2EXP plugin;

	
	
	public Buytaming(M2EXP plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		try{
		if(cmd.getName().equalsIgnoreCase("btaming")) {
		
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args[0].equals("info")){
						player.sendMessage("Buy Taming EXP");
						player.sendMessage("Price for 5 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 10 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 20 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 50 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 100 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 200 Units is: " + " and gives you: "+ " Exp of Taming");
						player.sendMessage("Price for 300 Units is: "+ " and gives you: "+ " Exp of Taming");
						player.sendMessage("Do /btaming and the number of units IE: /btaming 20");
				}
				else if (args[0].equals("5")){
								sender.sendMessage(String.format("You have %s", M2EXP.economy.format(M2EXP.economy.getBalance(player.getName()))));

								EconomyResponse r = M2EXP.economy.withdrawPlayer(player.getName(), plugin.p5);
									
									if(r.transactionSuccess()) {
											sender.sendMessage(String.format("You were given %s units of exp and now have %s", plugin.u5, M2EXP.economy.format(r.balance)));
											ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u5);
											
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u10);
										
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u20);
										
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u50);
										
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u100);
										
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u200);
										
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
										ExperienceAPI.addRawXP(player, SkillType.TAMING, plugin.u300);
										
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



