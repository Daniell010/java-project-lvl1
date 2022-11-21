package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static String question = "What number is missing in the progression?";
    public static String[] task = new String[3];
    public static int[] answers = new int[3];

    public static void Prog() {
        for (int k = 0; k < 3; k++) {
            task[k] ="";
        int initialNumber = (int) (Math.random() * ((10 - 1) + 1)) + 1; // начально число
        int hiddenNumber = (int) (Math.random() * ((10 - 2) + 2)); // скрытое число
        int step = (int) (Math.random() * ((5 - 2) + 2)) + 1; // шаг
        var sequence = 0;

            for (int i = 0; i < 10; i++) {
                if (i == hiddenNumber) {
                    task[k] += ".. ";
                    answers[k] = sequence + step;
                    sequence = sequence + step;
                    continue;
                }
                if (i == 0) {
                    task[k] += "Question: ";
                    sequence = initialNumber;
                } else sequence = sequence + step;
                task[k] += sequence + " ";
            }
        }
        Engine.progPlay();
    }
}
