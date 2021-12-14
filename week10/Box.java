package com.company;

public class Box {
    private double maxWeight;
    private double currentWeight;
    private int numberOfThings;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.numberOfThings = 0;
    }
    public void add(ToBeStored object){
        if ((this.currentWeight + object.weight()) <= this.maxWeight) {
            this.currentWeight += object.weight();
            this.numberOfThings++;
        }
    }
    public String toString(){
        return "Box: "+numberOfThings+" things, Weight: "+this.currentWeight+" kg";
    }
}