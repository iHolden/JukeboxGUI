package com.dumbninja22.JukeboxProgress;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Jukebox;
import org.bukkit.entity.Player;

public class ISoundManager {

	protected final static List<ISound> tracker = new ArrayList<ISound>();
	
	public static double getPercentageSung(Jukebox jb) {
		for(ISound is : tracker) {
			if(jb.getLocation().equals(is.getBlock().getLocation())) {
				return is.getPercentageComplete();
			}
		}
		
		return 0;
	}
	
	public static void addISound(Player p, Material record, Jukebox jb) {
		deleteISound(jb);
		tracker.add(new ISound(p, record, jb.getBlock()));
	}
	
	public static void deleteISound(Jukebox jb) {
		ISound tobeGone = null;
		for(ISound is : tracker) {
			if(is.getBlock().getLocation().equals(jb.getLocation())) {
				is.destroy();
				tobeGone = is;
			}
		}
		if(tobeGone != null) {
			tracker.remove(tobeGone);
		}
		
	}

}
