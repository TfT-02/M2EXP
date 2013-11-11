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
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */

public class Buy implements CommandExecutor
{
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if (commandSender instanceof Player)
        {

            Player player = (Player) commandSender;
            if (command.getName().equalsIgnoreCase("buy"))
            {
                if (strings[0].equalsIgnoreCase("cash") || strings[0].equalsIgnoreCase("money"))
                {
                    //TODO add code here that will check if it is a number
                    return true;
                } else if (strings[0].equalsIgnoreCase("exp") || strings[0].equalsIgnoreCase("xp"))
                {
                    //TODO add code here that will check if it is a number
                    return true;
                } else if (strings[0].equalsIgnoreCase("help"))
                {
                    player.sendMessage(ChatColor.AQUA + "You should probably check out /stock for current information ");
                    player.sendMessage(ChatColor.BLUE + "---------formatting---------");
                    player.sendMessage(ChatColor.GREEN + "command must be like /buy [currency] [skill] [unit amount]");
                    player.sendMessage(ChatColor.BOLD + "IE:" + ChatColor.stripColor(ChatColor.GREEN + "/buy cash mining 100"));
                } else
                {
                    player.sendMessage(ChatColor.RED + "Invalid: Arguments must be help, cash, money, exp, xp are the only valid accepted arguements");
                }
                return true;
            }
        } else
        {
            commandSender.sendMessage(ChatColor.RED + "We're sorry but you are not a player so you are not allowed to do the following commands /buy and /sell");
            commandSender.sendMessage(ChatColor.RED + "You however are allowed todo /money2XP, /stock and /stats ");
            return true;
        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
