package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static char[] arrayOper = {'+', '-', '*'};
    private static final int MAX_VAL = 20;
    private static final int MIN_VAL = 1;
    private static final int MAX_OP = 3;
    private static final int MIN_OP = 0;


    public static int calculation(int operand1, int operand2, char value) {
        int result = 0;
        switch (value) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            default:
                System.out.println("there is no such sign");

        }
        return result;
    }

    public static void playCalc() {

        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];
        Random random = new Random();
        for (int k = 0; k < Engine.COUNT_ROUNDS; k++) {

            var operand1 = random.nextInt(MAX_VAL) + MIN_VAL;
            var operand2 = random.nextInt(MAX_VAL) + MIN_VAL;
            var operator = random.nextInt(MAX_OP) + MIN_OP;
            questionAnswer[k][0] = "Question: " + operand1 + " " + arrayOper[operator] + " " + operand2;
            questionAnswer[k][1] = String.valueOf(calculation(operand1, operand2, arrayOper[operator]));

        }
        Engine.runGame(QUESTION, questionAnswer);

    }
}
