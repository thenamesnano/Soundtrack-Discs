package com.thenamesnano.soundtrackdiscs.init.items;

import com.thenamesnano.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Rarity;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class ModMusicDiscItem extends MusicDiscItem {

    public ModMusicDiscItem(int comparatorValue, Supplier<SoundEvent> soundSupplier) {
        super(comparatorValue, soundSupplier, new Item.Properties()
                .stacksTo(1)
                .tab(SoundtrackDiscs.SOUNDTRACK_DISCS_TAB)
                .rarity(Rarity.RARE)
        );
    }

}
