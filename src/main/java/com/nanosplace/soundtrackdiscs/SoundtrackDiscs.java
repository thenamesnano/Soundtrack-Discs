package com.nanosplace.soundtrackdiscs;

import com.mojang.logging.LogUtils;
import com.nanosplace.soundtrackdiscs.util.RegistryHandler;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod("soundtrackdiscs")
public class SoundtrackDiscs
{
    private static final Logger LOGGER = LogUtils.getLogger();

    // Hardcoded Mod Identification
    public static final String MOD_ID = "soundtrackdiscs";

    // ItemGroup Declaration
    public static final CreativeModeTab SOUNDTRACK_DISCS_TAB = new CreativeModeTab("soundtrackdiscs_items") {
        @Override
        public @NotNull ItemStack makeIcon() { return new ItemStack(RegistryHandler.MUSIC_DISC_CALM1.get()); }};

    // -4020941818228131454
    // Begin Mod
    public SoundtrackDiscs() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {}
}
