package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughJugsLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return _DynamicVariables.bankedJugs > 150;
    }

    @Override
    public int onLoop() {
        Logger.log("fill jugs");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
