package com.badcoffee.shittymod.setup;

import com.badcoffee.shittymod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("shittymod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.SHITTYBLOCK);
        }

    };

    public void init() {

    }
}
