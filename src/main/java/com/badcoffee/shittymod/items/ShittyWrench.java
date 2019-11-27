package com.badcoffee.shittymod.items;

import com.badcoffee.shittymod.ShittyMod;
import net.minecraft.item.Item;

public class ShittyWrench extends Item{
    public ShittyWrench() {
        super(new Item.Properties().group(ShittyMod.setup.itemGroup).maxStackSize(1));
        setRegistryName("shittywrench");
    }
}
