package com.pluralsight.namegenerator;
import java.util.Scanner;


public class NameManipulation {

    static Scanner scanner;

    public static void fullNameGenerator(String firstName, String middleName, String lastName, String suffix) {
        String fullName = "\n" + "Full Name: " + firstName + (middleName.isBlank() ? "": " " + middleName) + " " + lastName + " " + (suffix.isBlank()?"":" " + suffix);
        System.out.println(fullName + "\n");

    }
    public static void fullNameSeparator(String name) {
        String [] nameParts = name.trim().split(" ");
        String firstName = nameParts[0];
        if (nameParts.length > 2) {
            String middleName = nameParts[1];

            String lastName = nameParts[2];
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: "+ lastName);
        }
        else {
            String lastName = nameParts [1];
            System.out.println("\nFirst Name: " + firstName);
            System.out.println("Middle: (None)");
            System.out.println("Last Name: "+ lastName);
        }





    }


    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        boolean tryAgain = true;
        while (tryAgain) {

           System.out.println("1: Generate Full Name\n2: Separate Full Name");
            System.out.print("Choose an option: ");
           int userInput = scanner.nextInt();
           scanner.nextLine();


           if (userInput == 1) {
               System.out.println("Please Enter Your Name");
               String firstName = getInput("First Name: ");
               String middleName = getInput("Middle Name: ");
               String lastName = getInput("Last Name (If you have multiple last names seperate with a '-': ");
               String suffix = getInput("Suffix: ");
               fullNameGenerator(firstName, middleName, lastName, suffix);
           } else if (userInput == 2) {
                String name = getInput("Please Enter Your Full Name: ");
                fullNameSeparator(name);
                 tryAgain = false;

           } else {
               System.out.println("\nInvalid Input. Type '1' or '2'");
           }

       }
    }
    public static String getInput (String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
