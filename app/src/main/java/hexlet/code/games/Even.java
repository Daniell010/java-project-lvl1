package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    private static String[] even = new String[Engine.COUNT_ROUNDS];
    private static String[] task = new String[Engine.COUNT_ROUNDS];
    private static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int x)
    {
        if(x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void playEven() {
        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            var x = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            even[i] = isEven(x) ? "yes" : "no";
            task[i] = ("Question: " + x);
        }
        Engine.evenPlay(question, task, even);
    }

    public static String getQuestion() {
        return question;
    }

    public static String[] getEven() {
        return even;
    }

    public static String[] getTask() {
        return task;
    }
}
