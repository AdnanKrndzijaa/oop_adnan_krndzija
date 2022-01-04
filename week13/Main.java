package com.company;
import clicker.alogic.Calculator;
import clicker.alogic.PersonalCalculator;
import clicker.ui.UserInterface2;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import noticeboard.NoticeBoard;

public class Main {

    public static void main(String[] args) throws Exception {
        //task
        FileManager f = new FileManager();

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        //task
        FileManager f = new FileManager();
        f.save("src/testinput1.txt", "hello");

        //task
        FileManager f = new FileManager();
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("Object");
        list.add("Oriented");
        list.add("Programming");

        f.saveList("src/testinput1.txt", list);

        //task
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);

        //task
        UserInterface1 ui3 = new UserInterface1 ();
        SwingUtilities.invokeLater(ui3);

        //task
        NoticeBoard board = new NoticeBoard();
        SwingUtilities.invokeLater(board);

        //task
        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());

        Calculator calc2 = new PersonalCalculator();
        UserInterfaceTask5 ui5 = new UserInterfaceTask5(calc2);
        SwingUtilities.invokeLater(ui5);
    }


}
