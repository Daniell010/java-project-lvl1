package hexlet.code.games;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class Progression {
    private static int counter = 0;
    public static void Prog()
    {
        int initialNumber = (int)(Math.random()*((10-1)+1))+1; // начально число
        int hiddenNumber = (int)(Math.random()*((10-1)+1)); // скрытое число
        int step = (int)(Math.random()*((5-2)+2))+1; // шаг
        var sequence = 0;
        int openNumber = 1;

        for (int i = 0; i < 10; i++)
        {
            if(i == hiddenNumber)
            {
                System.out.print(".. ");
                openNumber = sequence + step;
                sequence = sequence + step;
                continue;
            }
            if (i == 0) {
                System.out.print("Question: ");
                sequence = initialNumber;
            }

            else sequence = sequence + step;
            System.out.print(sequence + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        var userInput = scanner.nextInt();
        if (userInput == openNumber)
        {
            System.out.println("Correct!");
            counter++;
            if(counter == 3)
            {
                System.out.println("Congratulations, " + Cli.name);
                counter = 0;
                return;
            }
        }
        else
        {
            System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                    + openNumber + "'.");
            System.out.println("Let's try again, " + Cli.name);
            counter=0;
            return;
        }
        Prog();



    }
}
