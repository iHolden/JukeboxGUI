package com.dumbninja22.JukeboxProgress;

import org.bukkit.Material;

public class IUtils {

	public static int convertDiscToLenght(Material disc) {
		if(disc == Material.GREEN_RECORD) {
			return 185;
		}
		if(disc == Material.GOLD_RECORD) {
			return 178;
		}
		if(disc == Material.RECORD_3) {
			return 345;
		}
		if(disc == Material.RECORD_4) {
			return 185;
		}
		if(disc == Material.RECORD_5) {
			return 174;
		}
		if(disc == Material.RECORD_6) {
			return 197;
		}
		if(disc == Material.RECORD_7) {
			return 96;
		}
		if(disc == Material.RECORD_8) {
			return 150;
		}
		if(disc == Material.RECORD_9) {
			return 188;
		}
		if(disc == Material.RECORD_10) {
			return 251;
		}
		if(disc == Material.RECORD_11) {
			return 71;
		}
		if(disc == Material.RECORD_12) {
			return 238;
		}
		return 0;
	}

}
