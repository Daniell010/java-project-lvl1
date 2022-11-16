package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet \n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);


        while (true) {
           var number = scanner.nextInt();
           switch (number)
           {
               case 1: Cli.writeName();
               break;
               case 2: Even.playEven();
               break;
               case 3:
                   System.out.println("What is the result of the expression?");
                   Calc.playCalc();
               break;
               case 4:
                   System.out.println("Find the greatest common divisor of given numbers.");
                   GCD.playGCD();
                   break;
               case  5:
                   System.out.println("What number is missing in the progression?");
                   Progression.Prog();
                   break;
               case 6:
                   System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                   Prime.playPrime();
                   break;
               case 0: return;
           }
            System.out.println("1 - Greet \n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
            System.out.print("Your choice:");

        }
    }
}
