package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    private static char[] arrayOper = {'+', '-', '*'};

    public static int calculation(int operand1, int operand2, char value) {
        int summa = 0;
        switch (value) {
            case '+':
                summa = operand1 + operand2;
                break;
            case '-':
                summa = operand1 - operand2;
                break;
            case '*':
                summa = operand1 * operand2;
                break;
            default:
                System.out.println("there is no such sign");

        }
        return summa;
    }

    public static void playCalc() {
        String question = "What is the result of the expression?";
        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];
        Random random = new Random();
        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {
            int[] arrayOfResponses = new int[2];
            final int maxVal = 20;
            final int minVal = 1;
            final int maxOp = 3;
            final int minOp = 0;
            var operand1 = random.nextInt(maxVal) + minVal;
            var operand2 = random.nextInt(maxVal) + minVal;
            var operator = random.nextInt(maxOp) + minOp;
            questionAnswer[k][0] = "Question: " + operand1 + " " + arrayOper[operator] + " " + operand2;
            questionAnswer[k][1] = "" + calculation(operand1, operand2, arrayOper[operator]);

        }
        Engine.runGame(question, questionAnswer);

    }
}
