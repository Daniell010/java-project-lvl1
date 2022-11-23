package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static void calcPlay(String question, String[] stringOfNumbers, int[] summa) {
        var name = Cli.writeName();
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(stringOfNumbers[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == summa[i]) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + summa[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");

    }
    public static void evenPlay(String question, String[] task, String[] even) {
        var name = Cli.writeName();
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(even[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + even[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
    public static void gcdPlay(String question, String[] task, int[] arrayGCD) {
        var name = Cli.writeName();
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == arrayGCD[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + arrayGCD[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
    public static void primePlay(String question, String[] task, String[] arrayPrime) {
        var name = Cli.writeName();
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(arrayPrime[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + arrayPrime[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
    public static void progPlay(String question, String[] task, int[] answers) {
        var name = Cli.writeName();
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == answers[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + name + "!");

    }
}
