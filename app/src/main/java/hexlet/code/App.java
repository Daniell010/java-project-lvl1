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
        var number = scanner.next();

           switch (number) {
               case "1": Cli.writeName();
               break;
               case "2": Even.playEven();
               break;
               case "3": Calc.playCalc();
               break;
               case "4": GCD.playGCD();
               break;
               case "5": Progression.prog();
               break;
               case "6": Prime.playPrime();
               break;
               default:
                   System.out.println("there is no such choice");
                   return;

        }
    }
}
