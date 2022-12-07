package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughDishesAndDoughLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return _DynamicVariables.bankedPieDishes >= 500 && _DynamicVariables.bankedPastryDough >= 500;
    }

    @Override
    public int onLoop() {
        Logger.log("Time to make pie shells");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
