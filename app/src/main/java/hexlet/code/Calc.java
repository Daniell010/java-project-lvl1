package hexlet.code;

import java.util.Scanner;

public class Calc {
    private static int choice = 0;
        public static void playCalc() {
            int[] arrayNum = new int[2];
            for (int i = 0; i < arrayNum.length; i++)
            {
                arrayNum[i] = (int)(Math.random()*((20-1)+1))+1;
            }

            var symbol = (int)(Math.random()*((3-1)+1))+1;
            var summa = 0;
            switch (symbol)
            {
                case 1:

                    System.out.println("Question: " + arrayNum[0] + " + " + arrayNum[1]);
                    summa = arrayNum[0] + arrayNum[1];
                    break;
                case 2:
                    System.out.println("Question: " + arrayNum[0] + " - " + arrayNum[1]);
                    summa = arrayNum[0] - arrayNum[1];
                    break;
                case 3:
                    System.out.println("Question: " + arrayNum[0] + " * " + arrayNum[1]);
                    summa = arrayNum[0] * arrayNum[1];
                    break;
            }
            Scanner scanner = new Scanner(System.in);
            int summaUser;
            System.out.print("Your answer: ");
            summaUser = scanner.nextInt();
            System.out.println(summaUser);


            if (summaUser == summa)
            {
                System.out.println("Correct!");
                choice++;
                if (choice == 3)
                {
                    System.out.println("Congratulations, " + Cli.name + "!");
                    return;
                }

            }
            else
            {
                System.out.println("'" + summaUser + "'" + "is wrong answer ;(. " + "Correct answer was " +
                       "'" + summa + "'");
                System.out.println("Let's try again, " + Cli.name + "!");
                return;
            }
            playCalc();

        }

    }

