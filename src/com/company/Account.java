package com.company;

import java.math.BigDecimal;

public abstract class Account {

    private String firstName;
    private String lastName;
    private Long accountNumber;
    private BigDecimal money;

    public Account() {

    }

    public Account(String firstName, String lastName, Long accountNumber, BigDecimal money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.money = money;
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

}
