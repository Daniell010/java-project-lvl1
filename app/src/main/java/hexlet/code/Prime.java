package hexlet.code;

import java.util.Scanner;

public class Prime {
    private static int counter;

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    public static void playPrime() {
        int randomNumber = (int) (Math.random() * ((10 - 1) + 1));
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if (userInput.equals("yes")) {
            if (checkSimple(randomNumber)) {
                System.out.println("Correct!");
                counter++;
                if(counter == 3)
                {
                    System.out.println("Congratulations, " + Cli.name);
                    counter = 0;
                    return;
                }

            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Cli.name);
                counter = 0;
                return;
            }
        } else if (userInput.equals("no")) {
            if (!checkSimple(randomNumber)) {
                System.out.println("Correct!");
                counter++;
                if(counter == 3)
                {
                    System.out.println("Congratulations, " + Cli.name);
                    counter = 0;
                    return;
                }
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name);
                counter = 0;
                return;
            }
        }
        playPrime();
    }
}