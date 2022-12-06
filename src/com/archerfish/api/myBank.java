package com.archerfish.api;

import org.dreambot.api.methods.container.impl.bank.Bank;

public class myBank {

    public static int bankedCoins = 0;

    public static boolean isOpen = Bank.isOpen();
    public static boolean isClosed = !Bank.isOpen();


}
