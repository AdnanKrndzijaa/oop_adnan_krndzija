package com.company;
import java.util.Arrays;

public class Fourth {
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args) {
        int[] values = {6, 2, 8, 7, 11};

        System.out.println("Before Swap: " + Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println("After 1. Swap: " + Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println("After 2. Swap: " + Arrays.toString(values));
    }
}
