package com.badcoffee.shittymod.setup;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("This code is Client-Side only !");
    }
}
