package com.alexpyslar03;

import com.alexpyslar03.item.LeadIngot;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeoArcana implements ModInitializer {
	public static final String MOD_ID = "neoarcana";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LeadIngot.register();

		LOGGER.info("Hello Fabric world!");
	}
}