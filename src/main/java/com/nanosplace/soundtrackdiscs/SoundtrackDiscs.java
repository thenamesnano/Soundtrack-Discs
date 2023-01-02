package com.nanosplace.soundtrackdiscs;

import com.mojang.logging.LogUtils;
import com.nanosplace.soundtrackdiscs.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("soundtrackdiscs")
public class SoundtrackDiscs
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "soundtrackdiscs";

    // -4020941818228131454
    // Begin Mod
    public SoundtrackDiscs() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init(eventBus);
        eventBus.addListener(this::buildContents);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void buildContents(CreativeModeTabEvent.Register event) {
        RegistryHandler.registerCreativeTab(event);
    }
}
