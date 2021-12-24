package com.company;
import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    private Scanner reader = null;

    public Printer(String fileName){
        this.file = new File(fileName);
    }
    public void printLinesWhichContain(String word){
        try {
            reader = new Scanner(this.file);
        }
        catch (Exception e) {
            System.out.println("We could not read the file, error: " + e.getMessage());
            return;
        }
        if (word.equals("")){
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        else{
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if(line.contains(word)){
                    System.out.println(line);
                }
            }
        }
        reader.close();
    }
}
