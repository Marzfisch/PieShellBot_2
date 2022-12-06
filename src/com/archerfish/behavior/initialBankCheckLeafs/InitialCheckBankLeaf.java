package com.archerfish.behavior.initialBankCheckLeafs;

import com.archerfish.api.myPlayer;
import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.Bank;
import org.dreambot.api.utilities.Sleep;
import org.dreambot.framework.Leaf;

public class InitialCheckBankLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return Bank.getClosestBankLocation().getArea(4).contains(myPlayer.player.getTile());
    }

    @Override
    public int onLoop() {
        Bank.open();
        Sleep.sleepUntil(Bank::isOpen, 15_000);
        Sleep.sleep(10_000);
        _DynamicVariables.initiallyCheckedBank = true;
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
