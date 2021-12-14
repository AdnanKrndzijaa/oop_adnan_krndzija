package com.company;
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    Map<String, Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }
        else {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        }
    }
    public int price(){
        int total_price = 0;
        for(Purchase p:basket.values()){
            total_price=total_price+p.price();
        }
        return total_price;
    }
    public void print(){
        for(Purchase p:basket.values()){
            System.out.println(p);
        }
    }
}
