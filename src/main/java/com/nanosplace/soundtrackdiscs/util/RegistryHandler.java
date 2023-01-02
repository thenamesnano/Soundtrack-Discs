package com.nanosplace.soundtrackdiscs.util;

import com.nanosplace.soundtrackdiscs.init.items.ModMusicDiscItem;
import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister
            .create(ForgeRegistries.ITEMS, SoundtrackDiscs.MOD_ID);
    public static DeferredRegister<SoundEvent> SOUNDS_EVENTS = DeferredRegister
            .create(ForgeRegistries.SOUND_EVENTS, SoundtrackDiscs.MOD_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
        SOUNDS_EVENTS.register(eventBus);
    }

    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(SoundtrackDiscs.MOD_ID, "items"), builder ->
                builder.title(Component.translatable("itemGroup." + SoundtrackDiscs.MOD_ID + ".items"))
                        .icon(() -> new ItemStack(RegistryHandler.MUSIC_DISC_CALM1.get()))
                        .displayItems((enabledFlags, populator, hasPermissions) -> {
                            for (RegistryObject<Item> item : ITEMS.getEntries()) {
                                populator.accept(item.get());
                            }
                        })
        );
    }

    // SoundEvents -----------------------------------------------------------------------------------------------------
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM1_SOUND = SOUNDS_EVENTS.register("music_disc.calm1",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM2_SOUND = SOUNDS_EVENTS.register("music_disc.calm2",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_CALM3_SOUND = SOUNDS_EVENTS.register("music_disc.calm3",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.calm3")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL1_SOUND = SOUNDS_EVENTS.register("music_disc.hal1",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL2_SOUND = SOUNDS_EVENTS.register("music_disc.hal2",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL3_SOUND = SOUNDS_EVENTS.register("music_disc.hal3",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal3")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_HAL4_SOUND = SOUNDS_EVENTS.register("music_disc.hal4",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.hal4")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NUANCE1_SOUND = SOUNDS_EVENTS.register("music_disc.nuance1",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.nuance1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_NUANCE2_SOUND = SOUNDS_EVENTS.register("music_disc.nuance2",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.nuance2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO1_SOUND = SOUNDS_EVENTS.register("music_disc.piano1",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano1")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO2_SOUND = SOUNDS_EVENTS.register("music_disc.piano2",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano2")));
    public static final RegistryObject<SoundEvent> MUSIC_DISC_PIANO3_SOUND = SOUNDS_EVENTS.register("music_disc.piano3",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SoundtrackDiscs.MOD_ID, "music_disc.piano3")));

    // Items -----------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Item> MUSIC_DISC_CALM1 = ITEMS.register("music_disc_calm1",
            () -> new ModMusicDiscItem(1, MUSIC_DISC_CALM1_SOUND, 220));
    public static final RegistryObject<Item> MUSIC_DISC_CALM2 = ITEMS.register("music_disc_calm2",
            () -> new ModMusicDiscItem(2, MUSIC_DISC_CALM2_SOUND, 201));
    public static final RegistryObject<Item> MUSIC_DISC_CALM3 = ITEMS.register("music_disc_calm3",
            () -> new ModMusicDiscItem(3, MUSIC_DISC_CALM3_SOUND, 229));
    public static final RegistryObject<Item> MUSIC_DISC_HAL1 = ITEMS.register("music_disc_hal1",
            () -> new ModMusicDiscItem(4, MUSIC_DISC_HAL1_SOUND, 209));
    public static final RegistryObject<Item> MUSIC_DISC_HAL2 = ITEMS.register("music_disc_hal2",
            () -> new ModMusicDiscItem(5, MUSIC_DISC_HAL2_SOUND, 188));
    public static final RegistryObject<Item> MUSIC_DISC_HAL3 = ITEMS.register("music_disc_hal3",
            () -> new ModMusicDiscItem(6, MUSIC_DISC_HAL3_SOUND, 191));
    public static final RegistryObject<Item> MUSIC_DISC_HAL4 = ITEMS.register("music_disc_hal4",
            () -> new ModMusicDiscItem(7, MUSIC_DISC_HAL4_SOUND, 255));
    public static final RegistryObject<Item> MUSIC_DISC_NUANCE1 = ITEMS.register("music_disc_nuance1",
            () -> new ModMusicDiscItem(8, MUSIC_DISC_NUANCE1_SOUND, 61));
    public static final RegistryObject<Item> MUSIC_DISC_NUANCE2 = ITEMS.register("music_disc_nuance2",
            () -> new ModMusicDiscItem(9, MUSIC_DISC_NUANCE2_SOUND, 69));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO1 = ITEMS.register("music_disc_piano1",
            () -> new ModMusicDiscItem(10, MUSIC_DISC_PIANO1_SOUND, 68));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO2 = ITEMS.register("music_disc_piano2",
            () -> new ModMusicDiscItem(11, MUSIC_DISC_PIANO2_SOUND,89));
    public static final RegistryObject<Item> MUSIC_DISC_PIANO3 = ITEMS.register("music_disc_piano3",
            () -> new ModMusicDiscItem(12, MUSIC_DISC_PIANO3_SOUND, 280));

}
