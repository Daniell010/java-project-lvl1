package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet \n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        var number = scanner.nextInt();
        processUserChoice(number);
        scanner.close();


    }
    private static void processUserChoice(int userChoice) {
        final var one = 1;
        final var two = 2;
        final var three = 3;
        final var four = 4;
        final var five = 5;
        final var six = 6;
        final var zero = 0;

           switch (userChoice) {
               case one: Cli.writeName();
               break;
               case two: Even.playEven();
               break;
               case three: Calc.playCalc();
               break;
               case four: GCD.playGCD();
               break;
               case five: Progression.prog();
               break;
               case six: Prime.playPrime();
               break;
               case zero: return;
               default:
                   System.out.println("there is no such choice");
                   return;

        }
    }
}
