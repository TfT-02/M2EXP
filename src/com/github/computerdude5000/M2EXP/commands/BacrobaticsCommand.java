package com.github.computerdude5000.M2EXP.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.computerdude5000.M2EXP.M2EXP;




public class BacrobaticsCommand implements CommandExecutor{
	private static M2EXP plugin;
	
	public  BacrobaticsCommand ( M2EXP instance) {

		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,
			String[] args) {
				return false;
		
		
		
	}

}
