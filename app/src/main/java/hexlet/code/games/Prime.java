package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static  String[] task = new String[3];
    public static String[] arrayPrime = new String[3];


    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    public static void playPrime() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * ((10 - 1) + 1));
            task[i] = ("Question: " + randomNumber);
            if(checkSimple(randomNumber))
            {
                arrayPrime[i] = "yes";
            }
            else arrayPrime[i] = "no";
        }
        Engine.primePlay();
    }
}