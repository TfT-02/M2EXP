/*
*copyright
*/
package update.stock;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 8/25/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */

public class Stock implements CommandExecutor
{
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if (command.getName().equalsIgnoreCase("stock"))
        {


            if (commandSender instanceof Player)
            {

                Player player = (Player) commandSender;
                //TODO add color codes
                player.sendMessage(ChatColor.BOLD + "    Current stocks are:");
                player.sendMessage(ChatColor.GREEN + "    Skill   |   Quantities of XHERE");     //TODO read from config how much 1 unit of exp is
                player.sendMessage(ChatColor.GREEN + "    Archery |                      ");//TODO read from config how much archery exp we have in stock
                player.sendMessage(ChatColor.GREEN + "  Acrobatics|                      "); //TODO read from config how much acrobatics exp we have in stock
                player.sendMessage(ChatColor.GREEN + "    Axes    |                      "); //TODO read from the config how much axes we have in stock
                player.sendMessage(ChatColor.GREEN + " Excavation |                      "); //TODO read from the config how much excavation we have in stock
                player.sendMessage(ChatColor.GREEN + "    Fishing |                      "); //TODO read from the config how much fishing we have in stock
                player.sendMessage(ChatColor.GREEN + "  Herbalism |                      "); //TODO read from the config how much herbalism we have in stock
                player.sendMessage(ChatColor.GREEN + "    Mining  |                      "); //TODO read from the config how much mining we have in stock
                player.sendMessage(ChatColor.GREEN + "                                   ");//TODO read from the config how much repair we have in stock
                player.sendMessage(ChatColor.GREEN + "    Swords  |                      ");//TODO read from the config how much swords we have in stock
                player.sendMessage(ChatColor.GREEN + "    Taming  |                      "); //TODO read from the config how much taming we have in stock
                player.sendMessage(ChatColor.GREEN + "    Unarmed |                      "); //TODO read from the config how much unarmed we have in stock
                player.sendMessage(ChatColor.GREEN + "Woodcutting |                      ");//TODO read from the config how much woodcutting we have in stock

            }
            else
            {
                //TODO add same code above but without the color codes

            }

        }
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
