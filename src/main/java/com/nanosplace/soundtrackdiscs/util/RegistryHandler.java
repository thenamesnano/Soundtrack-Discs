package com.nanosplace.soundtrackdiscs.util;

import com.nanosplace.soundtrackdiscs.init.items.ModMusicDiscItem;
import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister
            .create(ForgeRegistries.ITEMS, SoundtrackDiscs.MOD_ID);
    public static DeferredRegister<SoundEvent> SOUNDS_EVENTS = DeferredRegister
            .create(ForgeRegistries.SOUND_EVENTS, SoundtrackDiscs.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS_EVENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // SoundEvents -----------------------------------------------------------------------------------------------------
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM1_SOUND = SOUNDS_EVENTS.register("music_disc.calm1",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM2_SOUND = SOUNDS_EVENTS.register("music_disc.calm2",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM3_SOUND = SOUNDS_EVENTS.register("music_disc.calm3",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm3")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL1_SOUND = SOUNDS_EVENTS.register("music_disc.hal1",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL2_SOUND = SOUNDS_EVENTS.register("music_disc.hal2",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL3_SOUND = SOUNDS_EVENTS.register("music_disc.hal3",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal3")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL4_SOUND = SOUNDS_EVENTS.register("music_disc.hal4",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal4")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NUANCE1_SOUND = SOUNDS_EVENTS.register("music_disc.nuance1",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.nuance1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NUANCE2_SOUND = SOUNDS_EVENTS.register("music_disc.nuance2",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.nuance2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO1_SOUND = SOUNDS_EVENTS.register("music_disc.piano1",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO2_SOUND = SOUNDS_EVENTS.register("music_disc.piano2",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO3_SOUND = SOUNDS_EVENTS.register("music_disc.piano3",
            () -> new SoundEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano3")));

    // Items -----------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> MUSIC_DISC_CALM1 = ITEMS.register("music_disc_calm1",
            () -> new ModMusicDiscItem(1, MUSIC_DISC_CALM1_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_CALM2 = ITEMS.register("music_disc_calm2",
            () -> new ModMusicDiscItem(2, MUSIC_DISC_CALM2_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_CALM3 = ITEMS.register("music_disc_calm3",
            () -> new ModMusicDiscItem(3, MUSIC_DISC_CALM3_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_HAL1 = ITEMS.register("music_disc_hal1",
            () -> new ModMusicDiscItem(4, MUSIC_DISC_HAL1_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_HAL2 = ITEMS.register("music_disc_hal2",
            () -> new ModMusicDiscItem(5, MUSIC_DISC_HAL2_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_HAL3 = ITEMS.register("music_disc_hal3",
            () -> new ModMusicDiscItem(6, MUSIC_DISC_HAL3_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_HAL4 = ITEMS.register("music_disc_hal4",
            () -> new ModMusicDiscItem(7, MUSIC_DISC_HAL4_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_NUANCE1 = ITEMS.register("music_disc_nuance1",
            () -> new ModMusicDiscItem(8, MUSIC_DISC_NUANCE1_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_NUANCE2 = ITEMS.register("music_disc_nuance2",
            () -> new ModMusicDiscItem(9, MUSIC_DISC_NUANCE2_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO1 = ITEMS.register("music_disc_piano1",
            () -> new ModMusicDiscItem(10, MUSIC_DISC_PIANO1_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO2 = ITEMS.register("music_disc_piano2",
            () -> new ModMusicDiscItem(11, MUSIC_DISC_PIANO2_SOUND));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO3 = ITEMS.register("music_disc_piano3",
            () -> new ModMusicDiscItem(12, MUSIC_DISC_PIANO3_SOUND));

}
