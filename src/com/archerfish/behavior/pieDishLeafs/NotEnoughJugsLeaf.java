package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.api.myBank;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class NotEnoughJugsLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return myBank.bankedCoins > 500;
    }

    @Override
    public int onLoop() {
        Logger.log("Buy jugs");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
