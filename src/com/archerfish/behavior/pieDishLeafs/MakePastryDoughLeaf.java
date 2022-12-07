package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.framework.Leaf;

public class MakePastryDoughLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return _DynamicVariables.bankedPieDishes >= 500 && _DynamicVariables.bankedPastryDough < 500;
    }

    @Override
    public int onLoop() {
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
