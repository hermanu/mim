package com.manu.mim.Proxy;

import com.manu.mim.KeyHandler.KeyHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by manuelgarcia on 26/12/2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void bindKeys()
    {
        MinecraftForge.EVENT_BUS.register(new KeyHandler());
    }
}
