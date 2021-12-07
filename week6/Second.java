package com.company;

public class Second {
    public static void main(String[] args) {
        int[] values = {6, 2, 8, 7, 11};
        System.out.println("index of the smallest: " + indexOfTheSmallest(values));
    }

    public static int indexOfTheSmallest (int[] array){
        int smallest=array[0];
        int index=0;

        for (int i=0; i<array.length; i++){
            if (array[i]<smallest){
                index=i;
                smallest=array[i];
            }
        }
        return index;
    }
}
