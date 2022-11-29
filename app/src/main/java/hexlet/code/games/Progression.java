package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;



public class Progression {
         private static final String QUESTION = "What number is missing in the progression?";
         private static final int MAX_VAL = 10;
         private static final int MIN_HIDEN = 2;
         private static final int EIGHT = 8;
         private static  final int FIVE = 5;
         private static  final int MIN_VAL = 1;
         private static int[] buildProgression(int initialNumber, int length, int step) {
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
            int initialNumber = random.nextInt(MAX_VAL) + MIN_VAL; // начально число
            int hiddenNumber = random.nextInt(EIGHT) + MIN_HIDEN; // скрытое число
            int step = random.nextInt(FIVE) + MIN_HIDEN; // шаг
            final int length = 10;
            var mass = buildProgression(initialNumber, length, step);
            questionAnswer[k][1] = String.valueOf(mass[hiddenNumber]);
            for (int l = 0; l < MAX_VAL; l++) {
                if (l == 0) {
                    questionAnswer[k][0] = "";
                }
                if (l == hiddenNumber) {
                    questionAnswer[k][0] += ".. ";
                    continue;
                }
                questionAnswer[k][0] += mass[l];
                if(MAX_VAL - 1 == l) {
                    break;
                }
                questionAnswer[k][0] += " ";
            }

        }
        Engine.runGame(QUESTION, questionAnswer);
    }

}
