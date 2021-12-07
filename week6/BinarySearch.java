package com.company;

public class BinarySearch {
    public static int search(int[] array, int first, int last, int searchedValue){
        if (last>=first){
            int i = first+(last - first)/2;

            if (array[i] == searchedValue){
                return i;
            }

            if (array[i] > searchedValue){
                return search(array, first, i-1, searchedValue);
            }
            else{
                return search(array, i+1, last, searchedValue);
            }
        }
        return -1;
    }
}
