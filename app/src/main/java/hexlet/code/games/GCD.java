package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static String question = "Find the greatest common divisor of given numbers.";
    private static int[] arrayGCD = new int[Engine.COUNT_ROUNDS];
    private static  String[] task = new String[Engine.COUNT_ROUNDS];
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void playGCD() {
        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {
            int[] arrayNum = new int[2];
            final int maxVal = 100;
            final int minVal = 1;
            for (int i = 0; i < arrayNum.length; i++) {
                arrayNum[i] = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            }
            task[k] = "Question: " + arrayNum[0] + " " + arrayNum[1];
            arrayGCD[k] = gcd(arrayNum[0], arrayNum[1]);

        }
        Engine.gcdPlay(question, task, arrayGCD);
    }

    public static String[] getTask() {
        return task;
    }

    public static String getQuestion() {
        return question;
    }

    public static int[] getArrayGCD() {
        return arrayGCD;
    }

}
