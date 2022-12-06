package com.archerfish.behavior.initialBankCheckLeafs;

import com.archerfish.api.myPlayer;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.Bank;
import org.dreambot.framework.Leaf;

public class InitialRunToBankLeaf extends Leaf<Main> {

    // TODO: Make custom handler for messy code, and fix the 'radius' arg hardcode
    @Override
    public boolean isValid() {
        return !Bank.getClosestBankLocation().getArea(4).contains(myPlayer.player.getTile());
    }

    // TODO: You typed some stuff twice.... fix that, and the 'radius' arg hardcode
    @Override
    public int onLoop() {
        myPlayer.walk(Bank.getClosestBankLocation().getArea(4));
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
