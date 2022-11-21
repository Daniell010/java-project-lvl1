package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Progression {
    private static String question = "What number is missing in the progression?";
    private static String[] task = new String[Engine.getVictoryCount()];
    private static int[] answers = new int[Engine.getVictoryCount()];

    public static void prog() {
        Random random = new Random();
        final int TEN = 10;
        for (int k = 0; k < Engine.getVictoryCount(); k++) {
            task[k] ="";
            int initialNumber = random.nextInt(10) + 1; // начально число
            int hiddenNumber = random.nextInt(8) + 2; // скрытое число
            int step = random.nextInt(5) + 2; // шаг
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
