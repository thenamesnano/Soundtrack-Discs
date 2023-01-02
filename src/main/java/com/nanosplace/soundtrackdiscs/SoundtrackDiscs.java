package com.nanosplace.soundtrackdiscs;

import com.nanosplace.soundtrackdiscs.util.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoundtrackDiscs implements ModInitializer {

	public static final String MOD_ID = "soundtrackdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final ItemGroup SOUNDTRACKDISCS_ITEMS = FabricItemGroup.builder(new Identifier(MOD_ID, "items"))
			.icon(() -> new ItemStack(RegistryHandler.MUSIC_DISC_CALM1))
			.build();

	// -4020941818228131454
	@Override
	public void onInitialize() {
		RegistryHandler.init();
	}
}
