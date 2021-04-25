package com.company.restservice;

import java.util.HashMap;

public class Bank {

    private HashMap<Integer, Account> accDatabase;
    private Integer counter = 1;

    public Bank(){
        this.accDatabase = new HashMap<>();
        this.accDatabase.put(counter,new Account(1));
        Bank.getInstance().getAccount(1).addMoney(100);
    }

    public Account getAccount(int accID)
    {return this.accDatabase.get(accID);}

    public void newAccount(int accID){
        counter++;
        this.accDatabase.put(counter, new Account(accID));
    }

    private static Bank instance;
    public static Bank getInstance(){ //Singleton, there is only 1 bank
        if(instance == null)
            instance = new Bank();
        return instance;
    }
}
