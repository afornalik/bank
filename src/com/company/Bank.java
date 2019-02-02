package com.company;

import java.math.BigDecimal;

public class Bank {

    public static void main(String arg[]) {

        BankAccount account1 = new BankAccount("Andrzej", "Fornalik", 344530005430334L, new BigDecimal("10432.54"), true, "AliorBank", "Warszawa",AccountType.PERSONAL);


        System.out.println(account1.getMoney());

        account1.addBonus100(new BigDecimal(100));

        System.out.println(account1.getMoney());

    }
}
