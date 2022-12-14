package com.nanosplace.soundtrackdiscs.init.items;

import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModMusicDiscItem extends RecordItem {

    public ModMusicDiscItem(int comparatorValue, Supplier<SoundEvent> soundSupplier) {
        super(comparatorValue, soundSupplier, new Item.Properties()
                .stacksTo(1)
                .tab(SoundtrackDiscs.SOUNDTRACK_DISCS_TAB)
                .rarity(Rarity.RARE)
        );
    }

}
