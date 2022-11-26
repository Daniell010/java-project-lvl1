package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    public static boolean isEven(int x) {
        return (x % 2 == 0);
    }
    public static void playEven() {
        String[][] questionAnswer = new String[3][2];
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var x = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            questionAnswer[i][1] = isEven(x) ? "yes" : "no";
            questionAnswer[i][0] = ("Question: " + x);
        }
        Engine.runGame(question,questionAnswer);
    }


}
