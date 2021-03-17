package network.starplum.command;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
	
	@Override
	public boolean onCommand( CommandSender arg0,  Command arg1,  String arg2, String[] arg3 ) {

		final CommandSender sender = arg0;
		final Player        player = (Player) sender;
		
		final String[] args = arg3;
		
		final boolean isPlayer = sender instanceof Player;
		final boolean hasPermission = player.hasPermission("meteor.gamemode") || player.hasPermission("meteor.*");
		
		final GameMode CREATIVE = GameMode.CREATIVE;
		final GameMode SURVIVAL = GameMode.SURVIVAL;
		final GameMode ADVENTURE = GameMode.ADVENTURE;
		final GameMode SPECTATOR = GameMode.SPECTATOR;
		
		
		if(!isPlayer) {
			return false;
		} else {
			if(hasPermission) {
				if(args.length == 1) {
					if(args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("1")) {
						if(player.getGameMode() != GameMode.CREATIVE) {
							player.setGameMode(CREATIVE);
						} else player.sendMessage("§8§l* §fYou're already in §7Creative");
					} else if(args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("0")) {
						if(player.getGameMode() != GameMode.SURVIVAL) {
							player.setGameMode(SURVIVAL);
						} else player.sendMessage("§8§l* §fYou're already in §7Survival");
					} else if(args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("2")) {
						if(player.getGameMode() != GameMode.ADVENTURE) {
							player.setGameMode(ADVENTURE);
						} else player.sendMessage("§8§l* §fYou're already in §7Adventure");
					} if(args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("sp") || args[0].equalsIgnoreCase("3")) {
						if(player.getGameMode() != GameMode.SPECTATOR) {
							player.setGameMode(SPECTATOR);
						} else player.sendMessage("§8§l* §fYou're already in §7Spectator");
					} else player.sendMessage("§8§l* §fInvalid Gamemode.");
				} else player.sendMessage("§8§l* §7/gamemode <gamemode>");		
			} else player.sendMessage("§8§l* §fYou do not have permission to use this command !");
		} return true;
	}

}
