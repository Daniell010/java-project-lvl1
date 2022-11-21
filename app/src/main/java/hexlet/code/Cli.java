package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static void writeName() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
