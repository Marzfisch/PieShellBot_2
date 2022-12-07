package com.archerfish.behavior.pieDishLeafs;

import com.archerfish.api.myBank;
import com.archerfish.api.myPlayer;
import com.archerfish.behavior._DynamicVariables;
import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.bank.Bank;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.container.impl.equipment.Equipment;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.utilities.Logger;
import org.dreambot.api.utilities.Sleep;
import org.dreambot.framework.Leaf;

public class EarnGoldForJugsLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return myBank.bankedCoins < 500 && _DynamicVariables.bankedLogs < 57;
    }

    @Override
    public int onLoop() {
        Logger.log("Chop and sell logs");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }
}
