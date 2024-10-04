package com.pluralsight.ux;

import java.util.Scanner;

public class BadUX {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" this is an example of a bad user interface.");

        System.out.println("Choose an option 1. Proper newline characters 2.Scanner 3.Formatting");
        int userInput = inputScanner.nextInt();
        inputScanner.nextLine();

    }
}
