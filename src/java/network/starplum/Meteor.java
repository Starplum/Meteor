package network.starplum;

import org.bukkit.plugin.java.JavaPlugin;

import network.starplum.command.Gamemode;
import network.starplum.completer.GamemodeCompleter;

public class Meteor extends JavaPlugin {
	
	private JavaPlugin arg1 = this;
	
	private static Meteor meteor;
	
	@Override
	public void onEnable() {
		meteor = this;
		this.getCommand("gamemode").setExecutor(new Gamemode());
		this.getCommand("gamemode").setTabCompleter(new GamemodeCompleter());
	}
	
	public static Meteor getMeteor() {
		return meteor;
	}
	

}
