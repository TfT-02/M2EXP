/**
 * M2EXP - Buymining.java
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

import com.github.computerdude5000.m2exp.M2EXP;
import com.github.computerdude5000.m2exp.util.MagicNumbers;
import com.gmail.nossr50.api.ExperienceAPI;
import com.gmail.nossr50.datatypes.skills.SkillType;
import net.milkbowl.vault.economy.EconomyResponse;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Buymining implements CommandExecutor
{
    private M2EXP plugin;
    private int unitprice;
    private int expunits;
    private int p5;
    private int p10;
    private int p20;
    private int p50;
    private int p100;
    private int p200;
    private int p300;
    private int u5;
    private int u10;
    private int u20;
    private int u50;
    private int u100;
    private int u200;
    private int u300;

    public Buymining( M2EXP plugin )
    {
        this.plugin = plugin;
        unitprice = this.plugin.getModuleConfig( "mining" ).getInt(
                "unitprice" );
        expunits = this.plugin.getModuleConfig( "mining" ).getInt(
                "expunits" );
        p5 = unitprice * MagicNumbers.l5;
        p10 = unitprice * MagicNumbers.l10;
        p20 = unitprice * MagicNumbers.l20;
        p50 = unitprice * MagicNumbers.l50;
        p100 = unitprice * MagicNumbers.l100;
        p200 = unitprice * MagicNumbers.l200;
        p300 = unitprice * MagicNumbers.l300;
        u5 = expunits * MagicNumbers.l5;
        u10 = expunits * MagicNumbers.l10;
        u20 = expunits * MagicNumbers.l20;
        u50 = expunits * MagicNumbers.l50;
        u100 = expunits * MagicNumbers.l100;
        u200 = expunits * MagicNumbers.l200;
        u300 = expunits * MagicNumbers.l300;
    }


    public boolean onCommand( CommandSender sender, Command cmd,
                              String commandLabel, String[] args )
    {
        try
        {
            if ( cmd.getName( ).equalsIgnoreCase( "bmining" ) && M2EXP.perms.has( sender, "m2exp.buy.mining" ) )
            {

                if ( sender instanceof Player )
                {
                    Player player = ( Player ) sender;
                    //  if (M2EXP.perms.has(player, "m2exp.buy.mining"))
                    //  {
                    if ( args[ 0 ].equals( "info" ) )
                    {
                        player.sendMessage( "Buy Mining EXP" );
                        player.sendMessage( "Price for 5 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 10 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 20 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 50 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 100 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 200 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Price for 300 Units is: "
                                + " and gives you: " + " Exp of Mining" );
                        player.sendMessage( "Do /bmining and the number of units IE: /bmining 20" );
                    }
                    else if ( args[ 0 ].equals( "5" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p5 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u5,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u5 );
                            this.plugin.setExp_sold( u5 );
                            this.plugin.setMoney_lost( p5 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;
                    }
                    else if ( args[ 0 ].equals( "10" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p10 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u10,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u10 );
                            this.plugin.setExp_sold( u10 );
                            this.plugin.setMoney_lost( p10 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else if ( args[ 0 ].equals( "20" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p20 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u20,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u20 );
                            this.plugin.setExp_sold( u20 );
                            this.plugin.setMoney_lost( p20 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else if ( args[ 0 ].equals( "50" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p50 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u50,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u50 );
                            this.plugin.setExp_sold( u50 );
                            this.plugin.setMoney_lost( p50 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else if ( args[ 0 ].equals( "100" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p100 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u100,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u100 );
                            this.plugin.setExp_sold( u100 );
                            this.plugin.setMoney_lost( p100 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else if ( args[ 0 ].equals( "200" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p200 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u200,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u200 );
                            this.plugin.setExp_sold( u200 );
                            this.plugin.setMoney_lost( p200 );
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else if ( args[ 0 ].equals( "300" ) )
                    {
                        sender.sendMessage( String.format( "You have %s",
                                M2EXP.economy.format( M2EXP.economy
                                        .getBalance( player.getName( ) ) ) ) );

                        EconomyResponse r = M2EXP.economy.withdrawPlayer(
                                player.getName( ), p300 );

                        if ( r.transactionSuccess( ) )
                        {
                            sender.sendMessage( String
                                    .format( "You were given %s units of exp and now have %s",
                                            u300,
                                            M2EXP.economy.format( r.balance ) ) );
                            ExperienceAPI.addRawXP( player, SkillType.MINING.name( ),
                                    u300 );
                            this.plugin.setExp_sold( u300 );
                            this.plugin.setMoney_lost( p300 );
                            // thee   adfas
                        }
                        else
                        {
                            sender.sendMessage( String.format(
                                    "An error occured: %s", r.errorMessage ) );
                        }
                        return true;

                    }
                    else
                    {
                        player.sendMessage( "please use a valid number 5,10,20,50,100,200,300" );
                    }

                    return false;

                }
                else
                {
                    System.out
                            .println( "Sorry you are not a player and you don't have access to this command" );
                }
            }

        } catch ( ArrayIndexOutOfBoundsException e )
        {
            sender.sendMessage( "please enter an argument like info,5,10,20,50,100,200,300 " );
        }
        return false;
    }

}
