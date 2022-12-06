package com.archerfish.api;

import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.wrappers.interactive.Player;

public class myPlayer {

    public static Player player = Players.getLocal();

    public static boolean inventoryIsFull = Inventory.isFull();
    public static boolean inventoryIsEmpty = Inventory.isEmpty();

}
