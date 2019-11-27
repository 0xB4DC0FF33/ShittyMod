package com.badcoffee.shittymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ShittyBlock extends Block {
    public ShittyBlock() {
        super(Properties.create(Material.ORGANIC)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(0.4f)
        );
        setRegistryName("shittyblock");
    }
}
