package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    private static String[] even = new String[Engine.getVictoryCount()];
    private static String[] task = new String[Engine.getVictoryCount()];
    private static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        final int MAX_VAL = 100;
        final int MIN_VAL = 1;
        for (int i = 0; i < Engine.getVictoryCount(); i++) {
            var x = (int) (Math.random() * ((MAX_VAL - MIN_VAL) + MIN_VAL)) + MIN_VAL;
            even[i] = x % 2 == 0 ? "yes" : "no";
            task[i] = ("Question: " + x);
        }
        Engine.evenPlay();
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




