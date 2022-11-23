package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    private static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static  String[] task = new String[Engine.COUNT_ROUNDS];
    private static String[] arrayPrime = new String[Engine.COUNT_ROUNDS];


    public static boolean isPrime(int i)  {
        final int three = 3;
        final int two = 2;
        int n = three + two;
        if (i <= 1) {
            return false;
        } else if (i <= three) {
            return true;
        } else if (i % 2 == 0 || i % three == 0) {
            return false;
        }

        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0) {
                return false;
            }
            n = n + (n + 1);
        }
        return true;
    }

    public static void playPrime() {
        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int randomNumber = (int) (Math.random() * ((maxVal - minVal) + minVal));
            task[i] = ("Question: " + randomNumber);
            if (isPrime(randomNumber)) {
                arrayPrime[i] = "yes";
            } else {
                arrayPrime[i] = "no";
            }
        }
        Engine.primePlay(question, task, arrayPrime);
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
