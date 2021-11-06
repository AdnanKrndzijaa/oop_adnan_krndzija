package com.company;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private int maxSize=16;

    public Team (String newName){
        this.name=newName;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.players.size()<this.maxSize){
            this.players.add(player);
        }
    }
    public void printPlayers(){
        for(Player player:this.players){
            System.out.println(player);
        }
    }
    public void setMaxSize(int newMaxSize){
        this.maxSize = newMaxSize;
    }
    public int size(){
        return this.players.size();
    }

    public int goals(){
        int totalGoals = 0;

        for(Player player:this.players){
            totalGoals = totalGoals + player.getGoals();
        }
        return totalGoals;
    }
}
