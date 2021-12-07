package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        int[] arrayN = {-3, 2, 3, 4, 7, 8, 12};

        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(arrayN));
        System.out.println();
        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        int result = BinarySearch.search(arrayN, 0, arrayN.length, Integer.parseInt(searchedValue));

        if (result == -1) {
            System.out.println("Value: " + searchedValue + " is not in the array.");
        } else {
            System.out.println("Value: " + searchedValue + " is in the array.");
        }
    }
}
