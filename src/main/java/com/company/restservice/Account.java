package com.company.restservice;

public class Account {
    private float balance;
    private int accountNmbr;
    private boolean busy=false;

    public Account(int accountNmbr){
        this.balance = 0;
        this.accountNmbr = accountNmbr;
    }

    public float getBalance(){
        return balance;
    }

    public boolean getMoney(float money){
        if(busy)
            return false;
            //somebody is already getting money from this account at this moment

        busy = true;
        if(balance >= money) {
            balance -= money;

        try{ Thread.sleep(5000);
        }catch (Exception e){}

        busy = false;
            return true;
        } else {return false;}
    }

    public void addMoney(float money){
        balance += money;
    }
}
