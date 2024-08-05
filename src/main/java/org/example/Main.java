package org.example;

import org.example.models.Grocery;

public class Main {
    public static void main(String[] args) {
        Grocery.groceryList.add("tomato");
        Grocery.addItems("lemon");
        Grocery.addItems("cherry,artichoke");
        System.out.println(Grocery.groceryList);;
    }
}
