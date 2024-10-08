package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopsicleSticks {
    static List<String> names = new ArrayList<>(List.of("Adrian", "Alan", "Ayanna", "Brittany", "Caleb", "Damian", "Deiber", "Miriam", "Nicholas",
            "Tequila", "Jontez", "Jacob", "Anthony", "Siry", "Jermaine", "Jovaughn", "Quyen", "Keante", "Keely"));

    public String randomName() {
        int index = (int) (Math.random() * names.size());
        return names.get(index);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""

                  ___                _      _        __ _   _      _       \s
                  / _ \\___  _ __  ___(_) ___| | ___  / _\\ |_(_) ___| | _____\s
                 / /_)/ _ \\| '_ \\/ __| |/ __| |/ _ \\ \\ \\| __| |/ __| |/ / __|
                / ___/ (_) | |_) \\__ \\ | (__| |  __/ _\\ \\ |_| | (__|   <\\__ \\
                \\/    \\___/| .__/|___/_|\\___|_|\\___| \\__/\\__|_|\\___|_|\\_\\___/
                           |_|                                              \s

                Enter 1 to pick a name:
                """);
        int userInput = scanner.nextInt();
        scanner.nextLine();
        PopsicleSticks popsicleSticks = new PopsicleSticks();
        while (!names.isEmpty()) {
            System.out.printf("\033[2J");
            if (userInput == 1) {
                String name = popsicleSticks.randomName();
                System.out.println(name);
                popsicleSticks.removeName(name);
                System.out.print("\nEnter 1 to pick a name: ");
                userInput = scanner.nextInt();
                scanner.nextLine();
            }
        }
    }
}