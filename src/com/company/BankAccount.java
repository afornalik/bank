package com.company;

import java.math.BigDecimal;

public class BankAccount extends Account implements AccountTransaction,AccountAddBonus {

    private String bankName;
    private String bankLocalization;

    public BankAccount(String firstName, String lastName, Long accountNumber, BigDecimal money,Boolean accountActive,String bankName, String bankLocalization, AccountType accountType) {
        super(firstName, lastName, accountNumber, money, accountActive, accountType);
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

    @Override
    public BigDecimal addBonus100( BigDecimal bonus) {
         super.setMoney(super.getMoney().add(bonus));
        return super.getMoney();
    }
}
