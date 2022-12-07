package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughJugPacksLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return _DynamicVariables.bankedJugPacks >= 2;
    }

    @Override
    public int onLoop() {
        Logger.log("Has enough jug packs");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
