package org.dreambot.behaviour.exampleLeafs;

import org.dreambot.Main;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.MethodProvider;
import org.dreambot.api.methods.container.impl.bank.BankLocation;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.utilities.Logger;
import org.dreambot.framework.Leaf;

public class ExampleLeaf extends Leaf<Main> {

    @Override
    public boolean isValid() {
        return BankLocation.GRAND_EXCHANGE.getArea(10).contains(Players.getLocal().getTile());
    }

    @Override
    public int onLoop() {
        Logger.log("In Grand Exchange!");
        return (int) Calculations.nextGaussianRandom(350, 250);
    }

}
