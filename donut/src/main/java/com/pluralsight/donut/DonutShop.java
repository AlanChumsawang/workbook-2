package com.pluralsight.donut;

public class DonutShop
{

    public static void main(String[] args) {
        Donut d = new Donut();
        d.description = "Big Fluffy Donut with a cherry on top";
        d.calories = 499;
        d.price = 3.99;

        Donut d2 = new Donut();
        d2.description = "Chocolate cake donut";
        d2.calories = 399;
        d2.price = 1.99;

        printDonut(d);
        printDonut(d2);

    }
    public static void printDonut (Donut d) {
        System.out.println(d.description);
        System.out.printf(" Which costs $%.2f\n", d.price);
        System.out.println(d.calories);
    }
}

