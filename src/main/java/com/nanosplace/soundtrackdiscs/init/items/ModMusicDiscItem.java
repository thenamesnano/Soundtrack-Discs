package com.nanosplace.soundtrackdiscs.init.items;

import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Rarity;

public class ModMusicDiscItem extends MusicDiscItem {

    private final String KEY;

    public ModMusicDiscItem(int comparatorValue, SoundEvent soundEvent, String key) {
        super(comparatorValue, soundEvent, new Item.Settings()
                .maxCount(1)
                .group(SoundtrackDiscs.SOUNDTRACK_DISCS_TAB)
                .rarity(Rarity.RARE)
        );

        this.KEY = key;
    }

    public String getKey() {
        return this.KEY;
    }

}
