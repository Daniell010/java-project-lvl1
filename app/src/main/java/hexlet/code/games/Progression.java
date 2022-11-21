package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static String question = "What number is missing in the progression?";
    private static String[] task = new String[Engine.getVictoryCount()];
    private static int[] answers = new int[Engine.getVictoryCount()];

    public static void prog() {
        final int MAX_VAL = 10;
        final int MIN_HIDDEN = 10;
        final int FIVE = 5;
        final int MIN_VAL = 1;
        final int TEN = 10;
        for (int k = 0; k < Engine.getVictoryCount(); k++) {
            task[k] ="";
        int initialNumber = (int) (Math.random() * ((MAX_VAL - MIN_VAL) + MIN_VAL)) + MIN_VAL; // начально число
        int hiddenNumber = (int) (Math.random() * ((MAX_VAL - MIN_HIDDEN) + MIN_HIDDEN)); // скрытое число
        int step = (int) (Math.random() * ((FIVE - MIN_HIDDEN) + MIN_HIDDEN)) + MIN_VAL; // шаг
        var sequence = 0;

            for (int i = 0; i < TEN; i++) {
                if (i == hiddenNumber) {
                    task[k] += ".. ";
                    answers[k] = sequence + step;
                    sequence = sequence + step;
                    continue;
                }
                if (i == 0) {
                    task[k] += "Question: ";
                    sequence = initialNumber;
                } else {
                    sequence = sequence + step;
                }
                task[k] += sequence + " ";
            }
        }
        Engine.progPlay();
    }

    public static String[] getTask() {
        return task;
    }

    public static String getQuestion() {
        return question;
    }

    public static int[] getAnswers() {
        return answers;
    }
}
