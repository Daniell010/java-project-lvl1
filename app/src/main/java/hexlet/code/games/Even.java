package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private static String[] even = new String[3];
    private static String[] task = new String[3];
    private static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        for (int i = 0; i < 3; i++) {
            var x = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            even[i] = x % 2 == 0? "yes" : "no";
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




