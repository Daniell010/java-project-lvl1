package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet \n2 - Even\n3 - Calc \n0 - Exit");
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
               case 0: return;
           }
            System.out.println("1 - Greet \n2 - Even\n3 - Calc \n0 - Exit");



//            if (number == 1) {
//                Cli.writeName();
//
//            } else if (number == 2) {
//                Even.playEven();
//
//            } else if (number == 0) {
//                return;
//            }
//            System.out.println("1 - Greet \n2 - Even \n0 - Exit");
        }
    }
}
