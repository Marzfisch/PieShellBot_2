package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.api.myBank;
import com.archerfish.api.myPlayer;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class HasEnoughGoldForDishesLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return myBank.bankedCoins >= 100_000;
    }

    @Override
    public int onLoop() {

        if (BankLocation.GRAND_EXCHANGE.getArea(5).contains(myPlayer.player.getTile())) {
            myPlayer.walk(BankLocation.GRAND_EXCHANGE.getArea(5));
        }

        Logger.log("Time to purchase dishes you rich bastard!");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
