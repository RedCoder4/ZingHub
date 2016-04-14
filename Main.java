package me.RedCoder4.ZingHub;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable(){
		this.getLogger().info("_");
		Bukkit.getServer().broadcastMessage(ChatColor.GREEN +"ZingHub is Enabled!");
	}
	public void onDisable(){
		this.getLogger().info("_");
		Bukkit.getServer().broadcastMessage(ChatColor.RED +"ZingHub is Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("zing")){
				String zing = "spawn " + player.getName();
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), zing);
				player.sendMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.RED + "Returning you to Spawn");
				player.sendMessage(ChatColor.GOLD + "Plugin Made by RedCoder4");
				Bukkit.getServer().broadcastMessage(ChatColor.GOLD + "Another player teleported using ZingHub! Do /zing to be part of the fun!");
			}
		
		return false;
		
	}
}
