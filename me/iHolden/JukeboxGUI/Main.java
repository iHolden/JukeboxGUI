package me.iHolden.JukeboxGUI;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.Jukebox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.dumbninja22.JukeboxProgress.ISoundManager;

public class Main
  extends JavaPlugin
  implements Listener
{
  public static Main plugin;
  
  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
	Server server = getServer();
	ConsoleCommandSender consoleMessage = server.getConsoleSender();
	consoleMessage.sendMessage(ChatColor.DARK_PURPLE + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	consoleMessage.sendMessage("");
	consoleMessage.sendMessage(ChatColor.LIGHT_PURPLE + "JukeboxGUI ENABLED!");
	consoleMessage.sendMessage(ChatColor.LIGHT_PURPLE + "Version 1.0");
	consoleMessage.sendMessage(ChatColor.LIGHT_PURPLE + "By iHolden");
	consoleMessage.sendMessage("");
	consoleMessage.sendMessage(ChatColor.DARK_PURPLE + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
  }
  
  
  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent e)
  {
    final Player player = e.getPlayer();
    if ((player.hasPermission("jukeboxgui.use")) && 
      (e.getAction() == Action.RIGHT_CLICK_BLOCK) && 
      (e.getClickedBlock().getType() == Material.JUKEBOX))
    	 
    {
    	
      final Jukebox juke = (Jukebox)e.getClickedBlock().getState();
      e.setCancelled(true);
     // juke.setPlaying(null);
      
      IconMenu menu = new IconMenu("Select a record", 27, new IconMenu.OptionClickEventHandler()
      {
        public void onOptionClick(IconMenu.OptionClickEvent click)
        {
          if ((click.getPosition() == 11) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_10);
            ISoundManager.addISound(player, Material.RECORD_10, juke);
           
          }
          if ((click.getPosition() == 12) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_11);
            ISoundManager.addISound(player, Material.RECORD_11, juke);
          }
          if ((click.getPosition() == 13) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_12);
            ISoundManager.addISound(player, Material.RECORD_12, juke);
          }
          if ((click.getPosition() == 14) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_3);
            ISoundManager.addISound(player, Material.RECORD_3, juke);
          }
          if ((click.getPosition() == 15) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_4);
            ISoundManager.addISound(player, Material.RECORD_4, juke);
          }
          if ((click.getPosition() == 19) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.GREEN_RECORD);
            ISoundManager.addISound(player, Material.GREEN_RECORD, juke);
          }
          if ((click.getPosition() == 20) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_5);
            ISoundManager.addISound(player, Material.RECORD_5, juke);
          }
          if ((click.getPosition() == 21) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_6);
            ISoundManager.addISound(player, Material.RECORD_6, juke);
          }
          if ((click.getPosition() == 22) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_7);
            ISoundManager.addISound(player, Material.RECORD_7, juke);
          }
          if ((click.getPosition() == 23) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_8);
            ISoundManager.addISound(player, Material.RECORD_8, juke);
          }
          if ((click.getPosition() == 24) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.RECORD_9);
            ISoundManager.addISound(player, Material.RECORD_9, juke);
          }
          if ((click.getPosition() == 25) && 
            (player.hasPermission("jukeboxgui.use"))) {
        	  juke.setPlaying(null);
            juke.setPlaying(Material.GOLD_RECORD);
            ISoundManager.addISound(player, Material.GOLD_RECORD, juke);
          }
          click.setWillClose(true);
        }
      }, this)
      .setOption(0, new ItemStack(Material.LAPIS_BLOCK,1), "iTunes Beta Progress Bar", new String[] { "Testing..." })
      .setOption(8, new ItemStack(Material.LAPIS_BLOCK,1), "iTunes Beta Progress Bar", new String[] { "Testing..." })
        .setOption(11, new ItemStack(Material.RECORD_10, 1), "Ward", new String[] { "Click To Play Ward" })
        .setOption(12, new ItemStack(Material.RECORD_11, 1), "11", new String[] { "Click To Play 11" })
        .setOption(13, new ItemStack(Material.RECORD_12, 1), "Wait", new String[] { "Click To Play Wait" })
        .setOption(14, new ItemStack(Material.RECORD_3, 1), "Blocks", new String[] { "Click To Play Blocks" })
        .setOption(15, new ItemStack(Material.RECORD_4, 1), "Chirp", new String[] { "Click To Play Chirp" })
        .setOption(19, new ItemStack(Material.GREEN_RECORD, 1), "Cat", new String[] { "Click To Play Cat" })
        .setOption(20, new ItemStack(Material.RECORD_5, 1), "Far", new String[] { "Click To Play Far" })
        .setOption(21, new ItemStack(Material.RECORD_6, 1), "Mall", new String[] { "Click To Play Mall" })
        .setOption(22, new ItemStack(Material.RECORD_7, 1), "Mellohi", new String[] { "Click To Play Mellohi" })
        .setOption(23, new ItemStack(Material.RECORD_8, 1), "Stal", new String[] { "Click To Play Stal" })
        .setOption(24, new ItemStack(Material.RECORD_9, 1), "Strad", new String[] { "Click To Play Strad" })
        .setOption(25, new ItemStack(Material.GOLD_RECORD, 1), "13", new String[] { "Click To Play 13" });
      if(ISoundManager.getPercentageSung(juke) >= 14.285714285714285714285714285714) {
    	  menu.setOption(1, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(1, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 28.571428571428571428571428571428) {
    	  menu.setOption(2, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(2, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 42.857142857142857142857142857142) {
    	  menu.setOption(3, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(3, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 57.142857142857142857142857142856) {
    	  menu.setOption(4, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(4, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 71.42857142857142857142857142857) {
    	  menu.setOption(5, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(5, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 85.714285714285714285714285714284) {
    	  menu.setOption(6, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(6, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      if(ISoundManager.getPercentageSung(juke) >= 99.999999999999999999999999999998) {
    	  menu.setOption(7, new ItemStack(Material.GOLD_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      } else {
    	  menu.setOption(7, new ItemStack(Material.REDSTONE_BLOCK),"iTunes Beta Progress Bar", new String[] { "Testing..." });
      }
      menu.open(player);
    }
  }
  
  @EventHandler
  public void onBlockBreak(BlockBreakEvent e)
  {
    Player player = e.getPlayer();
    if ((player.hasPermission("jukeboxgui.use")) && 
      (e.getBlock().getType() == Material.JUKEBOX))
    {
      Jukebox juke = (Jukebox)e.getBlock().getState();
      juke.setPlaying(null);
    }
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    commandLabel.equalsIgnoreCase("jukebox");
    
    return false;
  }
}
