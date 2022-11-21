package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static final int victoryCount = 3;

    public static void calcPlay() {
        Cli.writeName();
        System.out.println(Calc.getQuestion());
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < victoryCount; i++) {
            System.out.println(Calc.getStringOfNumbers()[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == Calc.getSumma()[i]) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Calc.getSumma()[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");

    }
    public static void evenPlay() {
        Cli.writeName();
        System.out.println(Even.getQuestion());
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < victoryCount; i++) {
            System.out.println(Even.getTask()[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(Even.getEven()[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Even.getEven()[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
    public static void gcdPlay() {
        Cli.writeName();
        System.out.println(GCD.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < victoryCount; i++) {
            System.out.println(GCD.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == GCD.arrayGCD[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + GCD.arrayGCD[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
    public static void primePlay() {
        Cli.writeName();
        System.out.println(Prime.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < victoryCount; i++) {
            System.out.println(Prime.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.next();
            if (userInput.equals(Prime.arrayPrime[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Prime.arrayPrime[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }

        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
    public static void progPlay() {
        Cli.writeName();
        System.out.println(Progression.question);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < victoryCount; i++) {
            System.out.println(Progression.task[i]);
            System.out.print("Your answer: ");
            var userInput = scanner.nextInt();
            if (userInput == Progression.answers[i]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + Progression.answers[i] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");

    }
}