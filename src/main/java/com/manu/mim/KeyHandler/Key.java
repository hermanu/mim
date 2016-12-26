package com.manu.mim.KeyHandler;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/**
 * Created by manuelgarcia on 26/12/2016.
 */
public class Key {

    public final boolean rDown;

    Key()
    {
        this.rDown = Keyboard.isKeyDown(Keyboard.KEY_R);
    }

}
