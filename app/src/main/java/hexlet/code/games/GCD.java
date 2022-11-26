package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void playGCD() {
        String question = "Find the greatest common divisor of given numbers.";
        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];
        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {
            int[] arrayNum = new int[2];
            final int maxVal = 100;
            final int minVal = 1;
            for (int i = 0; i < arrayNum.length; i++) {
                arrayNum[i] = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            }
            questionAnswer[k][0] = "Question: " + arrayNum[0] + " " + arrayNum[1];
            questionAnswer[k][1] = "" + gcd(arrayNum[0], arrayNum[1]);

        }
        Engine.runGame(question, questionAnswer);
    }
}
