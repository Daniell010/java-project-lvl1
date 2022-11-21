package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static String[] even = new String[3];
    public static String[] task = new String[3];
    public static String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        for (int i = 0; i < 3; i++) {
            var x = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            even[i] = x % 2 == 0? "yes" : "no";
            task[i] = ("Question: " + x);
        }
        Engine.evenPlay();
    }
}




