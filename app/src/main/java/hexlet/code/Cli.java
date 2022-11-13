package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name;
    public static void writeName()
    {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello, "+ name + "!");
    }

}
