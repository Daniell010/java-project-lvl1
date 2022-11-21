package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    private static int VICTORY_COUNT = 3;

    public static void calcPlay() {
        Cli.writeName();
        System.out.println(Calc.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < VICTORY_COUNT; i++) {
            System.out.println(Calc.stringOfNumbers[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == Calc.summa[i]) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Calc.summa[i] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.name + "!");

    }
    public static void evenPlay() {
        Cli.writeName();
        System.out.println(Even.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < VICTORY_COUNT; i++) {
            System.out.println(Even.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(Even.even[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Even.even[i] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.name + "!");
    }
    public static void GCDplay() {
        Cli.writeName();
        System.out.println(GCD.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < VICTORY_COUNT; i++) {
            System.out.println(GCD.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == GCD.arrayGCD[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + GCD.arrayGCD[i] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.name + "!");
    }
    public static void primePlay() {
        Cli.writeName();
        System.out.println(Calc.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < VICTORY_COUNT; i++) {
            System.out.println(Prime.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(Prime.arrayPrime[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Prime.arrayPrime[i] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.name + "!");
    }
    public static void progPlay() {
        Cli.writeName();
        System.out.println(Calc.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < VICTORY_COUNT; i++) {
            System.out.println(Progression.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == Progression.answers[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Progression.answers[i] + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}