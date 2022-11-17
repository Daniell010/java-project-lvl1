package hexlet.code.games;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class GCD {
    private static int counter = 0;
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void playGCD ()
    {
        int[] arrayNum = new int[2];
        for (int i = 0; i < arrayNum.length; i++)
        {
            arrayNum[i] = (int)(Math.random()*((100-1)+1))+1;
        }
        System.out.println("Question: " + arrayNum[0] + " " + arrayNum[1]);
        Scanner scanner = new Scanner(System.in);
        int userGCD = scanner.nextInt();
        if(userGCD == gcd(arrayNum[0],arrayNum[1]) )
        {
            System.out.println("Correct!");
            counter++;
            if (counter == 3)
            {
                System.out.println("Congratulations, " + Cli.name);
                return;
            }
        }
        else {
            System.out.println("'" + userGCD + "'is wrong answer ;(. Correct answer was '"
                    + gcd(arrayNum[0],arrayNum[1]) + "'.");
            System.out.println("Let's try again, " + Cli.name);
            counter=0;
            return;
        }
        playGCD();

    }
}
