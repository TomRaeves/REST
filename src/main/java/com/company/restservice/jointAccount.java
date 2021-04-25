package com.company.restservice;

public class jointAccount extends Account {

    Account acc;

    public jointAccount(int accID, Account acc){
        super(accID);
        this.acc = acc;
    }

    @Override
    public void addMoney(float money) {
        acc.addMoney(money);
    }
}
