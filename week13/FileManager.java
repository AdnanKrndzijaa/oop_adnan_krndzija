package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private File read_file;
    Scanner reader = null;

    public FileManager(){}
    public ArrayList<String> read(String file){
        this.read_file = new File(file);
        ArrayList<String> list=new ArrayList<String>();
        try{
            reader = new Scanner(read_file);
        }
        catch (Exception e){
            System.out.println("We could not read the file, error: " + e.getMessage());
        }
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            list.add(line);
        }
        return list;
    }
    public void save (String fileName, String text) throws Exception{
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();
        }
        catch (Exception e){
            System.out.println("We could not write to the file, error: " + e.getMessage());
        }
        System.out.println("Content has been written to the file");
    }
    public void saveList(String fileName, ArrayList<String> texts) throws Exception{
        try{
            FileWriter writer = new FileWriter(fileName);
            for (String line:texts) {
                writer.write(line + "\n");
            }
            writer.close();
        }
        catch (Exception e){
            System.out.println("We could not write to the file, error: " + e.getMessage());
        }
        System.out.println("Content has been written to the file");
    }
}
