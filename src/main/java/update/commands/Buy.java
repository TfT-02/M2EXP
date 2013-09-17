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

                return true;
            }
        }
        else
        {
            commandSender.sendMessage(ChatColor.RED + "We're sorry but you are not a player so you are not allowed to do the following commands /buy and /sell");
            commandSender.sendMessage(ChatColor.RED + "You however are allowed todo /money2XP, /stock and /stats ");
           return true;
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
