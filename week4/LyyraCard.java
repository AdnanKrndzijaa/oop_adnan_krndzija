package com.company;

public class LyyraCard {
    private double balance;
    private String name;


    public LyyraCard(double balanceAtStart, String name){
        this.balance = balanceAtStart;
        this.name=name;
    }
    public String toString(){
        return name+" has "+ balance+" euros.";
    }
    public void payEconomical(){
        if (this.balance>=2.50){
            this.balance=this.balance-2.50;
        }

    }
    public void payGourmet(){
        if(this.balance>=4.00){
            this.balance=this.balance-4.00;
        }
    }
    public void loadMoney(double amount){
        if(amount>0){
            this.balance = this.balance+amount;
            if(this.balance > 150){
                this.balance = 150;
            }
        }
    }
}
