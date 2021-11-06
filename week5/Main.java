package com.company;

public class Main {

    public static void main(String[] args) {
        Team barcelona = new Team ("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        //barcelona.setMaxSize(1);

        Player Brian = new Player("Brian");
        Player Pekka = new Player ("Pekka", 39);

        barcelona.addPlayer(Brian);
        barcelona.addPlayer(Pekka);
        barcelona.addPlayer(new Player ("Mikael", 1));

        barcelona.printPlayers();
        //System.out.println("Number of players: " + barcelona.size());
        System.out.println("Total goals: " + barcelona.goals());
    }
}
