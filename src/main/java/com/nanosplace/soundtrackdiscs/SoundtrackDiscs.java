package com.nanosplace.soundtrackdiscs;

import com.nanosplace.soundtrackdiscs.util.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoundtrackDiscs implements ModInitializer {

	// Hardcoded Mod Identification
	public static final String MOD_ID = "soundtrackdiscs";

	// Logger
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// ItemGroup Declaration
	public static final ItemGroup SOUNDTRACK_DISCS_TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "items"),
			() -> new ItemStack(RegistryHandler.MUSIC_DISC_CALM1.asItem()));

	// -4020941818228131454
	// Begin Mod
	@Override
	public void onInitialize() {
		RegistryHandler.init();
	}
}
