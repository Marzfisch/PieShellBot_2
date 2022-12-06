package com.archerfish.api;

import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.wrappers.interactive.Player;

public class myPlayer {

    public static Player player = Players.getLocal();

    public static boolean inventoryIsFull = Inventory.isFull();
    public static boolean inventoryIsEmpty = Inventory.isEmpty();


    /**
     * Proper walking API implementation
     * @param area Area to walk to
     */
    public static void walk(Area area) {
        if (Walking.shouldWalk(Calculations.random(3, 12))) {
            Walking.walk(area);
        }
    }


}
