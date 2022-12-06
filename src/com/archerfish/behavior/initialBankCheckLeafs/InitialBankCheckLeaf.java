package com.archerfish.behavior.initialBankCheckLeafs;

import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.framework.Leaf;

public class InitialBankCheckLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int onLoop() {
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
