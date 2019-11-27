package com.badcoffee.shittymod.items;

import com.badcoffee.shittymod.ShittyMod;
import net.minecraft.item.Item;

public class ShittyShard extends Item {
    public ShittyShard() {
        super(new Item.Properties()
                .group(ShittyMod.setup.itemGroup)
                .maxStackSize(64)
        );
        setRegistryName("shittyshard");
    }
}
