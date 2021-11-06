package com.company;

public class Player {
    private String name;
    private int amountOfGoals;

    public Player (String newName){
        this.name=newName;
    }
    public Player (String name, int amountOfGoals){
        this.name=name;
        this.amountOfGoals=amountOfGoals;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public int getGoals(){
        return this.amountOfGoals;
    }
    public String toString(){
        return "Name: "+ this.name + " goals: "+ this.amountOfGoals;
    }


}
