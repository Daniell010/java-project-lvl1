package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;



public class Progression {
         private static String question = "What number is missing in the progression?";
         private static final int maxVal = 10;
         private static final int minHiden = 2;
         private static final int eight = 8;
         private static  final int five = 5;
         private static  final int minVal = 1;
         private static int[] writeProgressionArray(int initialNumber, int length, int step) {
             int i = 0;
             int[] mass = new int[length];
             while (i < length) {  // заполняем массив прогрессии
                 mass[i] = initialNumber;
                 initialNumber += step;
                 i++;
             }
             return mass;
         }
    public static void prog() {

        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];

        Random random = new Random();

        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {
            int initialNumber = random.nextInt(maxVal) + minVal; // начально число
            int hiddenNumber = random.nextInt(eight) + minHiden; // скрытое число
            int step = random.nextInt(five) + minHiden; // шаг
            var mass = writeProgressionArray(initialNumber, 10 , step);
            questionAnswer[k][1] = String.valueOf(mass[hiddenNumber]);
            for (int l = 0; l < maxVal; l++) {
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
