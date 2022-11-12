package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void writeName()
    {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        var name = sc.next();
        System.out.println("Hello, "+ name + "!");
    }
}
