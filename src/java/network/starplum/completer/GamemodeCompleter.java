package network.starplum.completer;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class GamemodeCompleter implements TabCompleter {
	
	final List<String> gamemode = new ArrayList<String>();
	
	public GamemodeCompleter() {
		gamemode.add("CREATIVE");
		gamemode.add("SURVIVAL");
		gamemode.add("ADVENTURE");
		gamemode.add("SPECTATOR");
	}
	
	@Override
	public List<String> onTabComplete(CommandSender arg0,  Command arg1, String arg2, String[] arg3) {
		
		final String[] args = arg3;
		
		if(arg1.getName().equalsIgnoreCase("gamemode") && args.length == 1) {
			return gamemode;
		} return null;
	}

}
