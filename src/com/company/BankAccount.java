package com.company;

import java.math.BigDecimal;

public class BankAccount extends Account implements AccountTransaction {

    private String bankName;
    private String bankLocalization;

    public BankAccount(String firstName, String lastName, Long accountNumber, BigDecimal money,String bankName, String bankLocalization) {
        super(firstName, lastName, accountNumber, money);
        this.bankName = bankName;
        this.bankLocalization = bankLocalization;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocalization() {
        return bankLocalization;
    }

    public void setBankLocalization(String bankLocalization) {
        this.bankLocalization = bankLocalization;
    }

    @Override
    public void moneyTransfer(BigDecimal money) {
        this.setMoney(this.getMoney().add(money));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", bankLocalization='" + bankLocalization + '\'' +
                '}';
    }
}
