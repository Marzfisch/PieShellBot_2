package com.archerfish.behavior.pieDishLeafs;

import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.framework.Leaf;

public class PieDishLeafTwo extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int onLoop() {
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
