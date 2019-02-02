package com.company;

import java.math.BigDecimal;

public abstract class Account {

    private String firstName;
    private String lastName;
    private Long accountNumber;
    private BigDecimal money;
    private Boolean accountActive;
    private AccountType accountType;

    public Account() {

    }


    public Account(String firstName, String lastName, Long accountNumber, BigDecimal money, Boolean accountActive, AccountType accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.money = money;
        this.accountActive= accountActive;
        this.accountType = accountType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNamber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getAccountActive() {
        return accountActive;
    }

    public void setAccountActive(Boolean accountActive) {
        this.accountActive = accountActive;
    }


    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                ", money=" + money +
                ", accountActive=" + accountActive +
                '}';
    }
}
