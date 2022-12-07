package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughClayAndJugsLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return _DynamicVariables.bankedJugsOfWater > 150;
    }

    @Override
    public int onLoop() {

        Logger.log("Time top make soft clay");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
