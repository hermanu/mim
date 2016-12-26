package com.manu.mim.KeyHandler;

import com.manu.mim.Util.LogHelper;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by manuelgarcia on 26/12/2016.
 */
public class KeyHandler {


    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onKey(GuiScreenEvent.KeyboardInputEvent.Pre event)
    {
        System.out.println("Aqui");
        LogHelper.info(event);
    }
}
