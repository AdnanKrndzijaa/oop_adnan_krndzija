package com.company;
import java.util.Random;

public class Dice {
    private int numberOfSides;
    private Random random;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public Dice() {
        System.out.println("Hello");
    }

    public int roll(){
        return random.nextInt(this.numberOfSides)+1;
    }

    public String toString(){
        return "Number of sides = " + this.numberOfSides;
    }
}

