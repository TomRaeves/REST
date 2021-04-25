package com.company.restservice;

public class Account {
    private float balance;
    private int accountNmbr;

    public Account(int accountNmbr){
        this.balance = 0;
        this.accountNmbr = accountNmbr;
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public boolean getMoney(float money){
        if(balance >= money) {
            balance -= money;
            return true;
        } else {return false;}
    }

    public void addMoney(float money){
        balance += money;
    }
}
