package com.company;
import box.BlackHoleBox;
import box.MaxWeightBox;
import box.OneThingBox;
import box.Thing;
import farmsimulator.Alive;
import farmsimulator.Barn;
import java.util.ArrayList;
import java.util.List;
import people.Person;
import people.Student;
import people.Teacher;
import farmsimulator.BulkTank;
import farmsimulator.Cow;
import farmsimulator.Farm;
import farmsimulator.Milkable;
import farmsimulator.MilkingRobot;
import java.util.LinkedList;

public class Main {
    public static void printDepartment(List<Person> people){
        for(Person p: people){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        //TASK
        Person pekka=new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko=new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        //TASK
        Student olli=new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());

        //TASK
        Teacher pekka=new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko=new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka);
        System.out.println(esko);
        Student olli=new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for (int i=0; i<25; i++) {
            olli.study();
        }
        System.out.println(olli);

        //TASK
        List<Person> people=new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));
        printDepartment(people);

        //TASK
        BulkTank tank=new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);
        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);

        //TASK
        Cow cow = new Cow();
        System.out.println(cow);

        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);
        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println("");

        cow=new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);

        //TASK
        MilkingRobot milkingRobot=new MilkingRobot();
        Cow cow=new Cow();
        milkingRobot.milk(cow);

        //TASK
        MilkingRobot milkingRobot=new MilkingRobot();
        Cow cow=new Cow();
        System.out.println("");

        BulkTank tank=new BulkTank();
        milkingRobot.setBulkTank(tank);
        System.out.println("Bulk tank: " + tank);

        for(int i=0; i<2; i++) {
            System.out.println(cow);
            System.out.println("Living..");
            for(int j=0; j<5; j++) {
                cow.liveHour();
            }
            System.out.println(cow);
            System.out.println("Milking...");
            milkingRobot.milk(cow);
            System.out.println("Bulk tank: " + tank);
            System.out.println("");
        }

        //TASK
        Barn barn=new Barn(new BulkTank());
        System.out.println("Barn: " + barn);
        MilkingRobot robot=new MilkingRobot();
        barn.installMilkingRobot(robot);
        Cow ammu=new Cow();
        ammu.liveHour();
        ammu.liveHour();
        barn.takeCareOf(ammu);
        System.out.println("Barn: " + barn);

        LinkedList<Cow> cowList=new LinkedList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());

        for(Cow cow:cowList){
            cow.liveHour();
            cow.liveHour();
        }
        barn.takeCareOf(cowList);
        System.out.println("Barn: " + barn);

        //TASK
        Farm farm=new Farm("Esko", new Barn(new BulkTank()));
        System.out.println(farm);
        System.out.println(farm.getOwner() + " is a tough guy!");

        //TASK
        Farm farm=new Farm("Esko", new Barn(new BulkTank()));
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        System.out.println(farm);

        //TASK
        Farm farm=new Farm("Esko", new Barn(new BulkTank()));
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.liveHour();
        farm.liveHour();
        System.out.println(farm);

        //TASK
        Farm farm=new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot=new MilkingRobot();
        farm.installMilkingRobot(robot);
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.liveHour();
        farm.liveHour();
        farm.manageCows();
        System.out.println(farm);

        //TASK
        MaxWeightBox coffeeBox=new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        //TASK
        OneThingBox box=new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        //TASK
        BlackHoleBox box=new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

    }
}
