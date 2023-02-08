package com.nanosplace.soundtrackdiscs.util;

import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import com.nanosplace.soundtrackdiscs.init.items.ModMusicDiscItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class RegistryHandler {

    public static List<ModMusicDiscItem> MUSIC_DISC_LIST = new ArrayList<>();
    public static List<SoundEvent> SOUND_EVENT_LIST = new ArrayList<>();

    public static void init() {
        MUSIC_DISC_LIST.add(MUSIC_DISC_CALM1);
        SOUND_EVENT_LIST.add(MUSIC_DISC_CALM1_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_CALM2);
        SOUND_EVENT_LIST.add(MUSIC_DISC_CALM2_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_CALM3);
        SOUND_EVENT_LIST.add(MUSIC_DISC_CALM3_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_HAL1);
        SOUND_EVENT_LIST.add(MUSIC_DISC_HAL1_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_HAL2);
        SOUND_EVENT_LIST.add(MUSIC_DISC_HAL2_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_HAL3);
        SOUND_EVENT_LIST.add(MUSIC_DISC_HAL3_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_HAL4);
        SOUND_EVENT_LIST.add(MUSIC_DISC_HAL4_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_NUANCE1);
        SOUND_EVENT_LIST.add(MUSIC_DISC_NUANCE1_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_NUANCE2);
        SOUND_EVENT_LIST.add(MUSIC_DISC_NUANCE2_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_PIANO1);
        SOUND_EVENT_LIST.add(MUSIC_DISC_PIANO1_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_PIANO2);
        SOUND_EVENT_LIST.add(MUSIC_DISC_PIANO2_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_PIANO3);
        SOUND_EVENT_LIST.add(MUSIC_DISC_PIANO3_SOUND);
        MUSIC_DISC_LIST.add(MUSIC_DISC_DOG);
        SOUND_EVENT_LIST.add(MUSIC_DISC_DOG_SOUND);

        for (ModMusicDiscItem item : MUSIC_DISC_LIST) {
            Registry.register(Registries.ITEM, new Identifier(SoundtrackDiscs.MOD_ID, item.getKey()), item);
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> content.add(item));
            ItemGroupEvents.modifyEntriesEvent(SoundtrackDiscs.SOUNDTRACKDISCS_ITEMS).register(content -> content.add(item));
        }
        for (SoundEvent sound : SOUND_EVENT_LIST) {
            Registry.register(Registries.SOUND_EVENT, sound.getId(), sound);
        }
    }

    // SoundEvents -----------------------------------------------------------------------------------------------------
    public static final SoundEvent MUSIC_DISC_CALM1_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.calm1"));
    public static final SoundEvent MUSIC_DISC_CALM2_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.calm2"));
    public static final SoundEvent MUSIC_DISC_CALM3_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.calm3"));
    public static final SoundEvent MUSIC_DISC_HAL1_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.hal1"));
    public static final SoundEvent MUSIC_DISC_HAL2_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.hal2"));
    public static final SoundEvent MUSIC_DISC_HAL3_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.hal3"));
    public static final SoundEvent MUSIC_DISC_HAL4_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.hal4"));
    public static final SoundEvent MUSIC_DISC_NUANCE1_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.nuance1"));
    public static final SoundEvent MUSIC_DISC_NUANCE2_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.nuance2"));
    public static final SoundEvent MUSIC_DISC_PIANO1_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.piano1"));
    public static final SoundEvent MUSIC_DISC_PIANO2_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.piano2"));
    public static final SoundEvent MUSIC_DISC_PIANO3_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.piano3"));
    public static final SoundEvent MUSIC_DISC_DOG_SOUND =
            SoundEvent.of(new Identifier(SoundtrackDiscs.MOD_ID,"music_disc.dog"));

    // Items -----------------------------------------------------------------------------------------------------------
    public static final ModMusicDiscItem MUSIC_DISC_CALM1 =
            new ModMusicDiscItem(1, MUSIC_DISC_CALM1_SOUND, "music_disc_calm1", 220);
    public static final ModMusicDiscItem MUSIC_DISC_CALM2 =
            new ModMusicDiscItem(2, MUSIC_DISC_CALM2_SOUND, "music_disc_calm2", 201);
    public static final ModMusicDiscItem MUSIC_DISC_CALM3 =
            new ModMusicDiscItem(3, MUSIC_DISC_CALM3_SOUND, "music_disc_calm3", 229);
    public static final ModMusicDiscItem MUSIC_DISC_HAL1 =
            new ModMusicDiscItem(4, MUSIC_DISC_HAL1_SOUND, "music_disc_hal1", 209);
    public static final ModMusicDiscItem MUSIC_DISC_HAL2 =
            new ModMusicDiscItem(5, MUSIC_DISC_HAL2_SOUND, "music_disc_hal2", 188);
    public static final ModMusicDiscItem MUSIC_DISC_HAL3 =
            new ModMusicDiscItem(6, MUSIC_DISC_HAL3_SOUND, "music_disc_hal3", 191);
    public static final ModMusicDiscItem MUSIC_DISC_HAL4 =
            new ModMusicDiscItem(7, MUSIC_DISC_HAL4_SOUND, "music_disc_hal4", 255);
    public static final ModMusicDiscItem MUSIC_DISC_NUANCE1 =
            new ModMusicDiscItem(8, MUSIC_DISC_NUANCE1_SOUND, "music_disc_nuance1", 61);
    public static final ModMusicDiscItem MUSIC_DISC_NUANCE2 =
            new ModMusicDiscItem(9, MUSIC_DISC_NUANCE2_SOUND, "music_disc_nuance2", 69);
    public static final ModMusicDiscItem MUSIC_DISC_PIANO1 =
            new ModMusicDiscItem(10, MUSIC_DISC_PIANO1_SOUND, "music_disc_piano1", 68);
    public static final ModMusicDiscItem MUSIC_DISC_PIANO2 =
            new ModMusicDiscItem(11, MUSIC_DISC_PIANO2_SOUND, "music_disc_piano2", 89);
    public static final ModMusicDiscItem MUSIC_DISC_PIANO3 =
            new ModMusicDiscItem(12, MUSIC_DISC_PIANO3_SOUND, "music_disc_piano3", 280);
    public static final ModMusicDiscItem MUSIC_DISC_DOG =
            new ModMusicDiscItem(12, MUSIC_DISC_DOG_SOUND, "music_disc_dog", 145);

}
