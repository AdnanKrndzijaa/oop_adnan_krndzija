package com.company;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            String password = "Adnan";

            while (true)  {
                System.out.println("Type the password: ");
                String pass = reader.nextLine();

                if (pass.equals(password)) {
                    System.out.println("Correct!");
                    break; }
                else {
                    System.out.println("Wrong!");
                }
            }
        }

    }
