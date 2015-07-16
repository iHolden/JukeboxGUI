package com.dumbninja22.JukeboxProgress;

import me.iHolden.JukeboxGUI.Main;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class ISound {
	
	Player p = null;
	Material record = null;
	int maxlenght = 0;
	int minlenght = 0;
	BukkitTask bt = null;
	Block bb = null;
	
	public ISound(Player p, Material record, Block bb) {
		this.p = p;
		this.record = record;
		this.maxlenght = IUtils.convertDiscToLenght(record);
		this.bb = bb;
		startSong();
	}
	
	private void startSong() {
		bt = new BukkitRunnable() {

			@Override
			public void run() {
				minlenght = minlenght + 1;
				if(minlenght >= maxlenght || bb.getType() != Material.JUKEBOX) {
					cancel();
					return;
				}
				
			}
			
		}.runTaskTimer(Main.getPlugin(Main.class), 0L, 20L);
	}
	
	protected double getPercentageComplete() {
		//Bukkit.getLogger().info(Math.round(minlenght * 100.0/maxlenght) + "");
		return Math.round(minlenght * 100.0/maxlenght);
	}
	
	protected Block getBlock() {
		return bb;
	}
	
	protected void destroy() {
		p = null;
		record = null;
		maxlenght = 0;
		minlenght = 0;
		if(bt != null) {
			bt.cancel();
		}
		bt = null;
	}

}
