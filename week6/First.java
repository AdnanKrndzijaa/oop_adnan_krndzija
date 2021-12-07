package com.company;

public class First {
    public static void main(String[] args){
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
    }

    public static int smallest(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }
}
