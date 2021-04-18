package main.java.com.arvigo.felicitations;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	spawnFirework sf; 

	@Override
    public void onEnable() {
    
	}
    
	@Override
    public void onDisable() {
    
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("hiphip")) {
            if (!(sender instanceof Player)) {
            	sender.sendMessage("Hooray");
            	Player player = (Player)sender; 
            	sf = new spawnFirework(player.getLocation());
            }
            
            else {
            	sender.sendMessage("You are not a player!");
            }

        }
        return false;
    }


}