package com.company;
import java.util.HashMap;

public class First {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("matt", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");

        System.out.println(names.get("mikael"));
    }
}
