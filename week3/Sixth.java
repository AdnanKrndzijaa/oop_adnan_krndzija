package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Sixth {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner (System.in);


        while (true) {
            System.out.print("Type your word: ");
            String word = reader.nextLine();
            if (words.contains(word)) {
                System.out.println("You gave a word " + word + " twice");
                break;
            }
            else{
                words.add(word);
            }
        }
        Collections.sort(words);
        for (String wr:words){
            System.out.println(wr);
        }

    }

}