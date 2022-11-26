package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Progression {


    public static void prog() {
        String question = "What number is missing in the progression?";
        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];

        Random random = new Random();
        final int ten = 10;
        final int maxVal = 10;
        final int minHiden = 2;
        final int eight = 8;
        final int five = 5;
        final int minVal = 1;
        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {
            int initialNumber = random.nextInt(maxVal) + minVal; // начально число
            int hiddenNumber = random.nextInt(eight) + minHiden; // скрытое число
            int step = random.nextInt(five) + minHiden; // шаг
            int[] mass = new int[ten];
            int i = 0;
            while (i < ten) {  // заполняем массив прогрессии
                mass[i] = initialNumber;  //есть готовый массив
                initialNumber += step;
                if (i == hiddenNumber) {
                    questionAnswer[k][1] = "" + mass[i]; //записали отввет
                }
                i++;
            }
            for (int l = 0; l < ten; l++) {  //
                if (l == 0) {
                    questionAnswer[k][0] = "Question:";
                }
                if (l == hiddenNumber) {
                    questionAnswer[k][0] += " ..";
                    continue;
                }
                questionAnswer[k][0] += " " + mass[l];
            }

        }
        Engine.runGame(question, questionAnswer);
    }

}
