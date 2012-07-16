package com.github.computerdude5000.M2EXP.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.SkillType;
import com.iConomy.system.Account;


import com.github.computerdude5000.M2EXP.M2EXP;

public class M2EXPCommand implements CommandExecutor{
	private static M2EXP plugin;
    private Account ico;
    private ExperienceAPI EAPI;
    private SkillType Archery;
    private SkillType Axes;
    private SkillType Acrobatics;
    private SkillType Excavation;
    private SkillType Herbalism;
    private SkillType Mining;
    private SkillType Repair;
    private SkillType Swords;
    private SkillType Taming;
    private SkillType Unarmed;
    private SkillType Woodcutting;
    
	public  M2EXPCommand ( M2EXP instance) {

		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
		Player player = null;
		if(cmd.getName().equalsIgnoreCase("m2exp")) {
			System.out.println(ChatColor.BOLD + "========================"+plugin.name+"========================");
			System.out.println(ChatColor.GREEN+plugin.name+" By "+plugin.author);
			System.out.println(ChatColor.BLUE +"Commands");
			System.out.println(ChatColor.BLUE +"/m2exp buy: buying of exp");
			System.out.println(ChatColor.BLUE +"/m2exp sell: Not yet implemented");
			System.out.println(ChatColor.BLUE +"/m2exp info: Info page on "+ plugin.name);
			System.out.println(ChatColor.BLUE +"/m2exp help: Help page for "+ plugin.name);
			System.out.println(ChatColor.BLUE +"/m2exp : The page you are on right now");
			System.out.println(ChatColor.BLUE +"/m2exp unit: give the cost per a unit group");
			System.out.println(ChatColor.BOLD +"========================"+plugin.name+"========================");
			if (sender instanceof Player) {
				player = (Player) sender;
			
			if(args[0].equals("buy")) {
				player.sendMessage(ChatColor.BOLD + "========================"+plugin.name+"========================");
				player.sendMessage(ChatColor.GREEN+plugin.name+" By "+plugin.author);
				player.sendMessage(ChatColor.BLUE +" Buy Commands");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy archery <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy axes <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy acrobatics <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy excavation <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy herbalism <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy mining <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy repair <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy swords <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy taming <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy unarmed <amount>");
				player.sendMessage(ChatColor.BLUE + "/m2exp buy woodcutting <amount>");
				player.sendMessage(ChatColor.BOLD + " Amount is set of numbers");
				player.sendMessage(ChatColor.BOLD + " the amounts are: 400,300,200,100,50,20,5");
					if(args[1].equals("archery")) {
						player.sendMessage("Archery skill buying commands");
							if(args[2].equals("100")) {
								// archery 100 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player, Archery, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ "has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
										}

							}
							else if(args[2].equals("200")) {
					// archery 200 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p200)){
									ico.getHoldings().subtract(plugin.p200);
									EAPI.addXP(player, Archery, plugin.u200);
									player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ "has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
										}
								
								}
							else if(args[2].equals("300")) {
					// archery 300 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p300)){
									ico.getHoldings().subtract(plugin.p300);
									EAPI.addXP(player, Archery, plugin.u300);
									player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
										}
								}
							else if(args[2].equals("400")) {
								//archery 400 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p400)){
									ico.getHoldings().subtract(plugin.p400);
									EAPI.addXP(player, Archery, plugin.u400);
									player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
										}
							     }   
							else if(args[2].equals("50")) {
								//archery 50 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p50)){
									ico.getHoldings().subtract(plugin.p50);
									EAPI.addXP(player, Archery, plugin.u50);
									player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
										}
								}
							else if(args[2].equals("20")) {
								//archery 20 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p20)){
									ico.getHoldings().subtract(plugin.p20);
									EAPI.addXP(player, Archery, plugin.u20);
									player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ "has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
										}
								}
							else if(args[2].equals("10")) {
								//archery 10 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p10)){
									ico.getHoldings().subtract(plugin.p10);
									EAPI.addXP(player, Archery, plugin.u10);
									player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
										}
								}
							else if(args[2].equals("5")) {
								// archery 5 units
								ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p5)){
									ico.getHoldings().subtract(plugin.p5);
									EAPI.addXP(player, Archery, plugin.u5);
									player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
										}
							}
								
					 }
					else if(args[1].equals("axes")) {
						             if(args[2].equals("100")) {
							             // axes 100 units
						            	 ico.equals(player.getName());
											if (ico.getHoldings().hasEnough(plugin.p100)){
												ico.getHoldings().subtract(plugin.p100);
												EAPI.addXP(player, Axes, plugin.u100);
												player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ "has been subtracted");
											} else {
													player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
													}
										}
									else if(args[2].equals("200")) {
							            // axes 200 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p200)){
											ico.getHoldings().subtract(plugin.p200);
											EAPI.addXP(player, Axes, plugin.u200);
											player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
												}
										}
									else if(args[2].equals("300")) {
							             // axes 300 units
										 ico.equals(player.getName());
											if (ico.getHoldings().hasEnough(plugin.p300)){
												ico.getHoldings().subtract(plugin.p300);
												EAPI.addXP(player, Axes, plugin.u300);
												player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
											} else {
													player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
													}
										}
									else if(args[2].equals("400")) {
										//axes 400 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p400)){
											ico.getHoldings().subtract(plugin.p400);
											EAPI.addXP(player, Axes, plugin.u400);
											player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ "has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
												}
									     }   
									else if(args[2].equals("50")) {
										//axes 50 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p50)){
											ico.getHoldings().subtract(plugin.p50);
											EAPI.addXP(player, Axes, plugin.u50);
											player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
												}
										}
									else if(args[2].equals("20")) {
										//axes 20 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p20)){
											ico.getHoldings().subtract(plugin.p20);
											EAPI.addXP(player, Axes, plugin.u20);
											player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
												}
										}
									else if(args[2].equals("10")) {
										//axes 10 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p10)){
											ico.getHoldings().subtract(plugin.p10);
											EAPI.addXP(player, Axes, plugin.u10);
											player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
												}
										}
									else if(args[2].equals("5")) {
										// axes 5 units
										ico.equals(player.getName());
										if (ico.getHoldings().hasEnough(plugin.p5)){
											ico.getHoldings().subtract(plugin.p5);
											EAPI.addXP(player, Axes, plugin.u5);
											player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
										} else {
												player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
												}
									}
						
					}
					else if(args[1].equals("acrobatics")) {
			             if(args[2].equals("100")) {
				             // acrobatics 100 units
			            	 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player, Acrobatics, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
										}
							}
						else if(args[2].equals("200")) {
				            // acrobatics 200 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p200)){
									ico.getHoldings().subtract(plugin.p200);
									EAPI.addXP(player, Acrobatics, plugin.u200);
									player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
										}
							}
						else if(args[2].equals("300")) {
				             //acrobatics  300 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p300)){
									ico.getHoldings().subtract(plugin.p300);
									EAPI.addXP(player, Acrobatics, plugin.u300);
									player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
										}
							}
						else if(args[2].equals("400")) {
							//acrobatics 400 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p400)){
									ico.getHoldings().subtract(plugin.p400);
									EAPI.addXP(player, Acrobatics, plugin.u400);
									player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
										}
						     }   
						else if(args[2].equals("50")) {
							//acrobatics 50 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p50)){
									ico.getHoldings().subtract(plugin.p50);
									EAPI.addXP(player, Acrobatics, plugin.u50);
									player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
										}
							}
						else if(args[2].equals("20")) {
							//acrobatics 20 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p20)){
									ico.getHoldings().subtract(plugin.p20);
									EAPI.addXP(player, Acrobatics, plugin.u20);
									player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
										}
							}
						else if(args[2].equals("10")) {
							//acrobatics 10 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p10)){
									ico.getHoldings().subtract(plugin.p10);
									EAPI.addXP(player, Acrobatics, plugin.u10);
									player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
										}
							}
						else if(args[2].equals("5")) {
							// acrobatics 5 units
							 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p5)){
									ico.getHoldings().subtract(plugin.p5);
									EAPI.addXP(player, Acrobatics, plugin.u5);
									player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
										}
						}
			
		}
					else if(args[1].equals("excavation")) {
			             if(args[2].equals("100")) {
				             // excavation 100 units
			            	 ico.equals(player.getName());
								if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player, Excavation, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
										}
							}
						else if(args[2].equals("200")) {
				            // excavation 200 units
							if (ico.getHoldings().hasEnough(plugin.p200)){
								ico.getHoldings().subtract(plugin.p200);
								EAPI.addXP(player, Excavation, plugin.u200);
								player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
									}
							}
						else if(args[2].equals("300")) {
				             //excavation  300 units
							if (ico.getHoldings().hasEnough(plugin.p300)){
								ico.getHoldings().subtract(plugin.p300);
								EAPI.addXP(player, Excavation, plugin.u300);
								player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
									}
							}
						else if(args[2].equals("400")) {
							//excavation 400 units
							if (ico.getHoldings().hasEnough(plugin.p400)){
								ico.getHoldings().subtract(plugin.p400);
								EAPI.addXP(player, Excavation, plugin.u400);
								player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
									}
						     }   
						else if(args[2].equals("50")) {
							//excavation 50 units
							if (ico.getHoldings().hasEnough(plugin.p50)){
								ico.getHoldings().subtract(plugin.p50);
								EAPI.addXP(player, Excavation, plugin.u50);
								player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
									}
							}
						else if(args[2].equals("20")) {
							//excavation 20 units
							if (ico.getHoldings().hasEnough(plugin.p20)){
								ico.getHoldings().subtract(plugin.p20);
								EAPI.addXP(player, Excavation, plugin.u20);
								player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
									}
							}
						else if(args[2].equals("10")) {
							//excavation 10 units
							if (ico.getHoldings().hasEnough(plugin.p10)){
								ico.getHoldings().subtract(plugin.p10);
								EAPI.addXP(player, Excavation, plugin.u10);
								player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
									}
							}
						else if(args[2].equals("5")) {
							//excavation 5 units
							if (ico.getHoldings().hasEnough(plugin.p5)){
								ico.getHoldings().subtract(plugin.p5);
								EAPI.addXP(player, Excavation, plugin.u5);
								player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
									}
						}
			
		}			
					else if(args[1].equals("herbalism")) {
			             if(args[2].equals("100")) {
				             // herbalism 100 units
			            		if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player,Herbalism, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
										}
							}
						else if(args[2].equals("200")) {
				            // herbalism 200 units
							if (ico.getHoldings().hasEnough(plugin.p200)){
								ico.getHoldings().subtract(plugin.p200);
								EAPI.addXP(player,Herbalism, plugin.u200);
								player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
									}
							}
						else if(args[2].equals("300")) {
				             //herbalism  300 units
							if (ico.getHoldings().hasEnough(plugin.p300)){
								ico.getHoldings().subtract(plugin.p300);
								EAPI.addXP(player,Herbalism, plugin.u300);
								player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
									}
							}
						else if(args[2].equals("400")) {
							//herbalism 400 units
							if (ico.getHoldings().hasEnough(plugin.p400)){
								ico.getHoldings().subtract(plugin.p400);
								EAPI.addXP(player,Herbalism, plugin.u400);
								player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
									}
						     }   
						else if(args[2].equals("50")) {
							//herbalism 50 units
							if (ico.getHoldings().hasEnough(plugin.p50)){
								ico.getHoldings().subtract(plugin.p50);
								EAPI.addXP(player,Herbalism, plugin.u50);
								player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
									}
							}
						else if(args[2].equals("20")) {
							//herbalism 20 units
							if (ico.getHoldings().hasEnough(plugin.p20)){
								ico.getHoldings().subtract(plugin.p20);
								EAPI.addXP(player,Herbalism, plugin.u20);
								player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
									}
							}
						else if(args[2].equals("10")) {
							//herbalism 10 units
							if (ico.getHoldings().hasEnough(plugin.p10)){
								ico.getHoldings().subtract(plugin.p10);
								EAPI.addXP(player,Herbalism, plugin.u10);
								player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
									}
							}
						else if(args[2].equals("5")) {
							//herbalism 5 units
							if (ico.getHoldings().hasEnough(plugin.p5)){
								ico.getHoldings().subtract(plugin.p5);
								EAPI.addXP(player,Herbalism, plugin.u5);
								player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
							}
							}
			
		}			
				else if(args[1].equals("mining")) {
			             if(args[2].equals("100")) {
				             // mining 100 units
			            	 if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player,Mining, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
							}
			             }
						else if(args[2].equals("200")) {
				            // mining 200 units
							 if (ico.getHoldings().hasEnough(plugin.p200)){
									ico.getHoldings().subtract(plugin.p200);
									EAPI.addXP(player,Mining, plugin.u200);
									player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
							}
							}
						else if(args[2].equals("300")) {
				             //mining  300 units
							 if (ico.getHoldings().hasEnough(plugin.p300)){
									ico.getHoldings().subtract(plugin.p300);
									EAPI.addXP(player,Mining, plugin.u300);
									player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
							}
							}
						else if(args[2].equals("400")) {
							//mining 400 units
							 if (ico.getHoldings().hasEnough(plugin.p400)){
									ico.getHoldings().subtract(plugin.p400);
									EAPI.addXP(player,Mining, plugin.u400);
									player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
							}
						     }   
						else if(args[2].equals("50")) {
							//mining 50 units
							 if (ico.getHoldings().hasEnough(plugin.p50)){
									ico.getHoldings().subtract(plugin.p50);
									EAPI.addXP(player,Mining, plugin.u50);
									player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
							}
							}
						else if(args[2].equals("20")) {
							//mining 20 units
							 if (ico.getHoldings().hasEnough(plugin.p20)){
									ico.getHoldings().subtract(plugin.p20);
									EAPI.addXP(player,Mining, plugin.u20);
									player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
							}
							}
						else if(args[2].equals("10")) {
							//mining 10 units
							 if (ico.getHoldings().hasEnough(plugin.p10)){
									ico.getHoldings().subtract(plugin.p10);
									EAPI.addXP(player,Mining, plugin.u10);
									player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
							}
							}
						else if(args[2].equals("5")) {
							//mining 5 units
							 if (ico.getHoldings().hasEnough(plugin.p5)){
									ico.getHoldings().subtract(plugin.p5);
									EAPI.addXP(player,Mining, plugin.u5);
									player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
							}
						}
			
		}			
				else if(args[1].equals("repair")) {
			             if(args[2].equals("100")) {
				             // repair 100 units
			            	 if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player,Repair, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
							}
							}
						else if(args[2].equals("200")) {
				            // repair 200 units
							 if (ico.getHoldings().hasEnough(plugin.p200)){
									ico.getHoldings().subtract(plugin.p200);
									EAPI.addXP(player,Repair, plugin.u200);
									player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
							}
							}
						else if(args[2].equals("300")) {
				             //repair  300 units
							 if (ico.getHoldings().hasEnough(plugin.p300)){
									ico.getHoldings().subtract(plugin.p300);
									EAPI.addXP(player,Repair, plugin.u300);
									player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
							}
							}
						else if(args[2].equals("400")) {
							//repair 400 units
							 if (ico.getHoldings().hasEnough(plugin.p400)){
									ico.getHoldings().subtract(plugin.p400);
									EAPI.addXP(player,Repair, plugin.u400);
									player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
							}
						     }   
						else if(args[2].equals("50")) {
							//repair 50 units
							 if (ico.getHoldings().hasEnough(plugin.p50)){
									ico.getHoldings().subtract(plugin.p50);
									EAPI.addXP(player,Repair, plugin.u50);
									player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
							}
							}
						else if(args[2].equals("20")) {
							//repair 20 units
							 if (ico.getHoldings().hasEnough(plugin.p20)){
									ico.getHoldings().subtract(plugin.p20);
									EAPI.addXP(player,Repair, plugin.u20);
									player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
							}
							}
						else if(args[2].equals("10")) {
							//repair 10 units
							 if (ico.getHoldings().hasEnough(plugin.p10)){
									ico.getHoldings().subtract(plugin.p10);
									EAPI.addXP(player,Repair, plugin.u10);
									player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
							}
							}
						else if(args[2].equals("5")) {
							//repair 5 units
							 if (ico.getHoldings().hasEnough(plugin.p5)){
									ico.getHoldings().subtract(plugin.p5);
									EAPI.addXP(player,Repair, plugin.u5);
									player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
							}
						}
			
		}								
				else if(args[1].equals("swords")) {
		             if(args[2].equals("100")) {
			             // swords 100 units
		            	 if(args[2].equals("100")) {
				             // repair 100 units
			            	 if (ico.getHoldings().hasEnough(plugin.p100)){
									ico.getHoldings().subtract(plugin.p100);
									EAPI.addXP(player,Swords, plugin.u100);
									player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
								} else {
										player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
								}
			            	 }
						}
					else if(args[2].equals("200")) {
			            // swords 200 units
						 if (ico.getHoldings().hasEnough(plugin.u200)){
								ico.getHoldings().subtract(plugin.p200);
								EAPI.addXP(player,Swords, plugin.u200);
								player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
							
		            	 }
						}
					else if(args[2].equals("300")) {
			             // swords  300 units
						 if (ico.getHoldings().hasEnough(plugin.u300)){
								ico.getHoldings().subtract(plugin.p300);
								EAPI.addXP(player,Swords, plugin.u300);
								player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
							
		            	 }
						}
					else if(args[2].equals("400")) {
						// swords 400 units
						 if (ico.getHoldings().hasEnough(plugin.u400)){
								ico.getHoldings().subtract(plugin.p400);
								EAPI.addXP(player,Swords, plugin.u400);
								player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
							
		            	 }
					     }   
					else if(args[2].equals("50")) {
						// swords 50 units
						 if (ico.getHoldings().hasEnough(plugin.u50)){
								ico.getHoldings().subtract(plugin.p50);
								EAPI.addXP(player,Swords, plugin.u50);
								player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
							
		            	 }
						}
					else if(args[2].equals("20")) {
						// swords 20 units
						 if (ico.getHoldings().hasEnough(plugin.u20)){
								ico.getHoldings().subtract(plugin.p20);
								EAPI.addXP(player,Swords, plugin.u20);
								player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
							
		            	 }
						}
					else if(args[2].equals("10")) {
						// swords 10 units
						 if (ico.getHoldings().hasEnough(plugin.u10)){
								ico.getHoldings().subtract(plugin.p10);
								EAPI.addXP(player,Swords, plugin.u10);
								player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
							
		            	 }
						}
					else if(args[2].equals("5")) {
						// swords 5 units
						 if (ico.getHoldings().hasEnough(plugin.u5)){
								ico.getHoldings().subtract(plugin.p5);
								EAPI.addXP(player,Swords, plugin.u5);
								player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
							
		            	 }
					}
		
	}										
				else if(args[1].equals("taming")) {
		             if(args[2].equals("100")) {
			             // taming 100 units
		            	 if (ico.getHoldings().hasEnough(plugin.p100)){
								ico.getHoldings().subtract(plugin.p100);
								EAPI.addXP(player,Taming, plugin.u100);
								player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
							}
		            	 
						}
					else if(args[2].equals("200")) {
			            // taming 200 units
						 if (ico.getHoldings().hasEnough(plugin.p200)){
								ico.getHoldings().subtract(plugin.p200);
								EAPI.addXP(player,Taming, plugin.u200);
								player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
							}
		            	 
						}
					else if(args[2].equals("300")) {
			             // taming  300 units
						 if (ico.getHoldings().hasEnough(plugin.p300)){
								ico.getHoldings().subtract(plugin.p300);
								EAPI.addXP(player,Taming, plugin.u300);
								player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
							}
						}
					else if(args[2].equals("400")) {
						// taming 400 units
						 if (ico.getHoldings().hasEnough(plugin.p400)){
								ico.getHoldings().subtract(plugin.p400);
								EAPI.addXP(player,Taming, plugin.u400);
								player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
							}
					     }   
					else if(args[2].equals("50")) {
						// taming 50 units
						 if (ico.getHoldings().hasEnough(plugin.p50)){
								ico.getHoldings().subtract(plugin.p50);
								EAPI.addXP(player,Taming, plugin.u50);
								player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
							}
						}
					else if(args[2].equals("20")) {
						// taming 20 units
						 if (ico.getHoldings().hasEnough(plugin.p20)){
								ico.getHoldings().subtract(plugin.p20);
								EAPI.addXP(player,Taming, plugin.u20);
								player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
							}
						}
					else if(args[2].equals("10")) {
						// taming 10 units
						 if (ico.getHoldings().hasEnough(plugin.p10)){
								ico.getHoldings().subtract(plugin.p10);
								EAPI.addXP(player,Taming, plugin.u10);
								player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
							}
						}
					else if(args[2].equals("5")) {
						// taming 5 units
						 if (ico.getHoldings().hasEnough(plugin.p5)){
								ico.getHoldings().subtract(plugin.p5);
								EAPI.addXP(player,Taming, plugin.u5);
								player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
							}
					}
		
	}										
				else if(args[1].equals("Unarmed")) {
		             if(args[2].equals("100")) {
			             // unarmed 100 units
		            	 if (ico.getHoldings().hasEnough(plugin.p100)){
		            		 ico.getHoldings().subtract(plugin.p100);
								EAPI.addXP(player,Unarmed, plugin.u100);
								player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
							}
						}
					else if(args[2].equals("200")) {
			            // unarmed 200 units
						if (ico.getHoldings().hasEnough(plugin.p200)){
							ico.getHoldings().subtract(plugin.p200);
							EAPI.addXP(player,Unarmed, plugin.u200);
							player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
						}
						}
					else if(args[2].equals("300")) {
			             // unarmed  300 units
						if (ico.getHoldings().hasEnough(plugin.p300)){
							ico.getHoldings().subtract(plugin.p300);
							EAPI.addXP(player,Unarmed, plugin.u300);
							player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
						}
						}
					else if(args[2].equals("400")) {
						// unarmed 400 units
						if (ico.getHoldings().hasEnough(plugin.p400)){
							ico.getHoldings().subtract(plugin.p400);
							EAPI.addXP(player,Unarmed, plugin.u400);
							player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
						}
					     }   
					else if(args[2].equals("50")) {
						// unarmed 50 units
						if (ico.getHoldings().hasEnough(plugin.p50)){
							ico.getHoldings().subtract(plugin.p50);
							EAPI.addXP(player,Unarmed, plugin.u50);
							player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
						}
						}
					else if(args[2].equals("20")) {
						// unarmed 20 units
						if (ico.getHoldings().hasEnough(plugin.p20)){
							ico.getHoldings().subtract(plugin.p20);
							EAPI.addXP(player,Unarmed, plugin.u20);
							player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
						}
						}
					else if(args[2].equals("10")) {
						// unarmed 10 units
						if (ico.getHoldings().hasEnough(plugin.p10)){
							ico.getHoldings().subtract(plugin.p10);
							EAPI.addXP(player,Unarmed, plugin.u10);
							player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
						}
						}
					else if(args[2].equals("5")) {
						// unarmed 5 units
						if (ico.getHoldings().hasEnough(plugin.p5)){
							ico.getHoldings().subtract(plugin.p5);
							EAPI.addXP(player,Unarmed, plugin.u5);
							player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
						}
					}
		
	}										
				else if(args[1].equals("woodcutting")) {
		             if(args[2].equals("100")) {
			             // woodcutting 100 units
		            	 if (ico.getHoldings().hasEnough(plugin.p100)){
								ico.getHoldings().subtract(plugin.p100);
								EAPI.addXP(player,Woodcutting, plugin.u100);
								player.sendMessage(plugin.u100 + " of exp have been added and "+plugin.p100+ " has been subtracted");
							} else {
									player.sendMessage(ChatColor.RED +"You dont have enough money to buy 100 units!");
							}
						}
					else if(args[2].equals("200")) {
			            // woodcutting 200 units
						if (ico.getHoldings().hasEnough(plugin.p200)){
							ico.getHoldings().subtract(plugin.p200);
							EAPI.addXP(player,Woodcutting, plugin.u200);
							player.sendMessage(plugin.u200 + " of exp have been added and "+plugin.p200+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 200 units!");
						}
						}
					else if(args[2].equals("300")) {
			             // woodcutting  300 units
						if (ico.getHoldings().hasEnough(plugin.p300)){
							ico.getHoldings().subtract(plugin.p300);
							EAPI.addXP(player,Woodcutting, plugin.u300);
							player.sendMessage(plugin.u300 + " of exp have been added and "+plugin.p300+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 300 units!");
						}
						}
					else if(args[2].equals("400")) {
						// woodcutting 400 units
						if (ico.getHoldings().hasEnough(plugin.p400)){
							ico.getHoldings().subtract(plugin.p400);
							EAPI.addXP(player,Woodcutting, plugin.u400);
							player.sendMessage(plugin.u400 + " of exp have been added and "+plugin.p400+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 400 units!");
						}
					     }   
					else if(args[2].equals("50")) {
						// woodcutting 50 units
						if (ico.getHoldings().hasEnough(plugin.p50)){
							ico.getHoldings().subtract(plugin.p50);
							EAPI.addXP(player,Woodcutting, plugin.u50);
							player.sendMessage(plugin.u50 + " of exp have been added and "+plugin.p50+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 50 units!");
						}
						}
					else if(args[2].equals("20")) {
						// woodcutting 20 units
						if (ico.getHoldings().hasEnough(plugin.p20)){
							ico.getHoldings().subtract(plugin.p20);
							EAPI.addXP(player,Woodcutting, plugin.u20);
							player.sendMessage(plugin.u20 + " of exp have been added and "+plugin.p20+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 20 units!");
						}
						}
					else if(args[2].equals("10")) {
						// woodcutting 10 units
						if (ico.getHoldings().hasEnough(plugin.p10)){
							ico.getHoldings().subtract(plugin.p10);
							EAPI.addXP(player,Woodcutting, plugin.u10);
							player.sendMessage(plugin.u10 + " of exp have been added and "+plugin.p10+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 10 units!");
						}
						}
					else if(args[2].equals("5")) {
						// woodcutting 5 units
						if (ico.getHoldings().hasEnough(plugin.p5)){
							ico.getHoldings().subtract(plugin.p5);
							EAPI.addXP(player,Woodcutting, plugin.u5);
							player.sendMessage(plugin.u5 + " of exp have been added and "+plugin.p5+ " has been subtracted");
						} else {
								player.sendMessage(ChatColor.RED +"You dont have enough money to buy 5 units!");
						}
					}
		
	}													
					}
			
			
	        else if(args[0].equals("sell")) {
				player.sendMessage("Sorry This feature is not yet availible, should be ready in about a week");
            }
	        else if(args[0].equals("help")) {	
	        	player.sendMessage("========================"+plugin.name+"========================");
	        	player.sendMessage(plugin.name + " Help");
	        	player.sendMessage("/m2exp: Displays basic usage of "+ plugin.name);
	        	player.sendMessage("/m2exp buy: Allows the buying of skills do /m2exp for more info!");
	        	player.sendMessage("/m2exp sell: Not yet implemented ");
	        	//will allow you to sell your skill points if you need some cash!");
	        	player.sendMessage("/m2exp help: This page that you are on!");
	        	player.sendMessage("/m2exp info: Displays basic info of "+plugin.name);
	        	player.sendMessage("/m2exp unit: Displays the amount of xp given in a unit and a cost per a unit!");
	        	player.sendMessage("========================"+plugin.name+"========================");
	        	
			}
			
			else if(args[0].equals("info")) {		
				player.sendMessage("========================"+plugin.name+"========================");
				player.sendMessage(plugin.name+" By "+plugin.author);
				player.sendMessage("Contact: "+ plugin.contact);
				player.sendMessage("Github location: "+ plugin.github);
				player.sendMessage(plugin.info);
				player.sendMessage("========================"+plugin.name+"========================");
			}
			else if(args[0].equals("unit")) {
				player.sendMessage("========================"+plugin.name+"========================");
				player.sendMessage("The current amount of exp for one unit is: "+plugin.unitexp);
				player.sendMessage("The current price for one unit of exp is: "+ plugin.unitprice);
				player.sendMessage("400 units would give you: " + plugin.u400 +" and costs: "+ plugin.p400);
				player.sendMessage("300 units would give you: " + plugin.u300 + " and costs: " + plugin.p300);
				player.sendMessage("200 units would give you: "+plugin.u200+" and costs: "+plugin.p200);
				player.sendMessage("100 units would give you: " +plugin.u100+" and costs: "+plugin.p100);
				player.sendMessage("50 units would give you: "+plugin.u50+" and costs: "+ plugin.p50);
				player.sendMessage("20 units would give you: "+ plugin.u20+" and costs: "+plugin.p20 );
				player.sendMessage("5 units would give you: "+ plugin.u5+ " and costs: "+plugin.p5);
				player.sendMessage("========================"+plugin.name+"========================");
			}
			}
			else {
				System.out.println("Sorry you must login to the game to use those commands all you can use is m2exp help, and m2exp info");
			if(args[0].equals("help")) {	
				System.out.println("========================"+plugin.name+"========================");
				System.out.println(plugin.name + " Help");
				System.out.println("/m2exp: Displays basic usage of "+ plugin.name);
				System.out.println("/m2exp buy: Allows the buying of skills do /m2exp for more info!");
				System.out.println("/m2exp sell: Not yet implemented ");
	        	//will allow you to sell your skill points if you need some cash!");
				System.out.println("/m2exp help: This page that you are on!");
				System.out.println("/m2exp info: Displays basic info of "+plugin.name);
				System.out.println("/m2exp unit: Displays the amount of xp given in a unit and a cost per a unit!");
				System.out.println("========================"+plugin.name+"========================");
	        	
			}
			
			else if(args[0].equals("info")) {	
				System.out.println("========================"+plugin.name+"========================");
				System.out.println(plugin.name+" By "+plugin.author);
				System.out.println("Contact: "+ plugin.contact);
				System.out.println("Github location: "+ plugin.github);
				System.out.println(plugin.info);
				System.out.println("========================"+plugin.name+"========================");
			}
			
			}
		}
return true;
}
}
