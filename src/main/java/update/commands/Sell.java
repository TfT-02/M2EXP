/*
*copyright
*/
package update.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 8/25/13
 * Time: 11:24 PM
 * To change this template use File | Settings | File Templates.
 */

public class Sell implements CommandExecutor
{
    public boolean onCommand( CommandSender commandSender, Command command, String s, String[] strings )
    {
        if ( commandSender instanceof Player )
        {
            Player player = ( Player ) commandSender;
            if ( command.getName( ).equalsIgnoreCase( "sell" ) )
            {
                if ( strings[ 0 ].equalsIgnoreCase( "cash" ) || strings[ 0 ].equalsIgnoreCase( "money" ) )
                {

                    try
                    {
                        double d = Double.parseDouble( strings[ 1 ] );
                    } catch ( NumberFormatException nfe )
                    {
                        player.sendMessage( ChatColor.RED + "Enter A Number Please!!" );
                        return false;
                    }
                    return true;
                }
                else if ( strings[ 0 ].equalsIgnoreCase( "exp" ) || strings[ 0 ].equalsIgnoreCase( "xp" ) )
                {

                    try
                    {
                        double d = Double.parseDouble( strings[ 1 ] );
                    } catch ( NumberFormatException nfe )
                    {
                        player.sendMessage( ChatColor.RED + "Enter A Number Please!!" );
                        return false;
                    }
                    return true;
                }
                else if ( strings[ 0 ].equalsIgnoreCase( "help" ) )
                {

                    player.sendMessage( ChatColor.AQUA + "You should probably check out /stock for current information " );
                    player.sendMessage( ChatColor.BLUE + "---------formatting---------" );
                    player.sendMessage( ChatColor.GREEN + "command must be like /sell [currency] [unit amount] [skill]" );
                    player.sendMessage( ChatColor.BOLD + "IE:" + ChatColor.stripColor( ChatColor.GREEN + "/sell cash 100 mining " ) );
                }
                else
                {
                    player.sendMessage( ChatColor.RED + "Invalid: Arguments must be help, cash, money, exp, xp are the only valid accepted arguements" );
                }
                return true;
            }
        }
        else
        {
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}