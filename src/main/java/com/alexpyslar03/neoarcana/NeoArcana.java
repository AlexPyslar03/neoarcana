package com.alexpyslar03.neoarcana;

import com.alexpyslar03.neoarcana.item.LeadIngot;
import net.fabricmc.api.ModInitializer;

public class NeoArcana implements ModInitializer {
	public static final String MOD_ID = "neoarcana";

	@Override
	public void onInitialize() {
		// Регистрация блока и предметов
		LeadIngot.register();

		System.out.println("NeoArcana Mod initialized!");
	}
}