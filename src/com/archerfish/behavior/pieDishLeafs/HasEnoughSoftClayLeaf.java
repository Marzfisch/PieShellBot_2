package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.api.myBank;
import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughSoftClayLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return myBank.bankedCoins < 100_000 && _DynamicVariables.bankedSoftClay > 150;
    }

    @Override
    public int onLoop() {

        Logger.log("time to craft your soft clay");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
