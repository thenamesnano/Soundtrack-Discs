package com.nanosplace.soundtrackdiscs.init.items;

import com.nanosplace.soundtrackdiscs.SoundtrackDiscs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModMusicDiscItem extends RecordItem {

    public ModMusicDiscItem(int comparatorValue, Supplier<SoundEvent> soundSupplier, int lengthInSeconds) {
        super(comparatorValue, soundSupplier, new Item.Properties()
                .stacksTo(1)
                .tab(SoundtrackDiscs.SOUNDTRACK_DISCS_TAB)
                .rarity(Rarity.RARE),
                (lengthInSeconds*20) // Converting seconds to ticks here because I don't want to write *20 on all the lines in RegistryHandler
        );
    }

}
