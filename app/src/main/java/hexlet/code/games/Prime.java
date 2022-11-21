package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    private static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static  String[] task = new String[Engine.getVictoryCount()];
    private static String[] arrayPrime = new String[Engine.getVictoryCount()];


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
        final int MAX_VAL = 10;
        final int MIN_VAL = 1;
        for (int i = 0; i < Engine.getVictoryCount(); i++) {
            int randomNumber = (int) (Math.random() * ((MAX_VAL - MIN_VAL) + MIN_VAL));
            task[i] = ("Question: " + randomNumber);
            if(checkSimple(randomNumber))
            {
                arrayPrime[i] = "yes";
            }
            else arrayPrime[i] = "no";
        }
        Engine.primePlay();
    }

    public static String getQuestion() {
        return question;
    }

    public static String[] getTask() {
        return task;
    }

    public static String[] getArrayPrime() {
        return arrayPrime;
    }
}