package com.pluralsight.ux;

import java.util.Scanner;

public class GoodUX {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Hello, here are some benefits of a good user interface.\n");
        System.out.print("Enter '1' To Continue:  ");
        int userInput = inputScanner.nextInt();
        inputScanner.nextLine();
        if (userInput == 1) {
            System.out.println("""
                    
                                     Using Newline characters Correctly Helps With:
                    
                    * Improved Readability 
                        -> Newline characters can be used to separate sections of text, making information 
                           easier comprehend.
                    * Creates A Professional Appeal:
                        -> Correctly utilizing the newline character also create a more premium feeling to your programs 
                           allowing users to easily use your program correctly
                    """);
            System.out.print("Enter '1' to see an example of a bad user interface: " );
            int createBadUx = inputScanner.nextInt();
            inputScanner.nextLine();
            if (createBadUx == 1) {
                System.out.println(" this is an example of a bad user interface.");
                System.out.print("Choose an option 1. Create an account 2.Log in 3. forgot password?");
                int userInput2 = inputScanner.nextInt();
                inputScanner.nextLine();
                if (userInput2 == 1) {
                    System.out.print("  Enter your username");
                    String username = inputScanner.nextLine();
                    System.out.println("Enter   \nyour password");
                    String password = inputScanner.nextLine();
                    System.out.println("\n\nTo see a better example of a user interface enter '1'");
                    int goodux = inputScanner.nextInt();
                    if (goodux == 1) {
                        System.out.println("\n\nHello, this is an example of a better user interface.\n");
                        System.out.print("1. Create an account\n2. Log in\n3. Forgot password?\n\n Choose An Option: ");
                        int userInput3 = inputScanner.nextInt();
                        inputScanner.nextLine();
                        if (userInput3 == 1) {
                            System.out.print("Enter your username: ");
                            String username2 = inputScanner.nextLine();
                            System.out.print("Enter your password: ");
                            String password2 = inputScanner.nextLine();
                            System.out.println("\n\nAccount Created Successfully\n\nYour Username is: "+ username2 + "\nYour password is: " + password2);
                        }
                    }
                }
            }


        }
    }
}
