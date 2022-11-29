package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
   private static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }
    public static void playEven() {
        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];

        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var x = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            questionAnswer[i][1] = isEven(x) ? "yes" : "no";
            questionAnswer[i][0] = ("Question: " + x);
        }
        Engine.runGame(question, questionAnswer);
    }


}
