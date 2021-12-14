package com.company;
import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome "+customer);
        System.out.println("You can find our products:");

        for (String product:store.products()) {
            System.out.println(product);
        }
        while (true) {
            System.out.print("What do you want to buy(please press enter for paying):");
            String product = reader.nextLine();
            if (product.isEmpty()){
                break;
            }
            if (store.stock(product)>0){
                store.take(product);
                basket.add(product, store.price(product));
            }
        }
        System.out.println("Purchases: ");
        basket.print();
        System.out.println("Price: "+basket.price());
    }
}