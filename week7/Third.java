package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Third {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();

        for (String translation : translations) {
            System.out.println(translation);
        }
        HashMap<String, String> wordPairs = new HashMap<String, String>();
        wordPairs.put("monkey", "animal");
        wordPairs.put("South", "compass point");
        wordPairs.put("sauerkraut", "food");

        for (String key : wordPairs.keySet()){
            System.out.print(key+" ");
        }

        String input = "translate\n" + "monkey\n"  +  "translate\n" + "cheese\n" + "add\n"  + "cheese\n" + "juusto\n" + "translate\n" + "cheese\n" + "quit\n";

        Scanner reader = new Scanner(input);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}

