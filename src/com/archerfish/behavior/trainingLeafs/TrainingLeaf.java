package com.archerfish.behavior.trainingLeafs;

import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.framework.Leaf;

public class TrainingLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int onLoop() {
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
