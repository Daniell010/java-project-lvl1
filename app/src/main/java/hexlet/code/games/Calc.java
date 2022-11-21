package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String question = "What is the result of the expression?";
    private static String[] stringOfNumbers = new String[3];
    private static int[] summa = new int[3];

    public static void playCalc() {
        for (int k =0; k < 3; k++){
            int[] arrayOfResponses = new int[2];
            for (int i = 0; i < arrayOfResponses.length; i++) {
                arrayOfResponses[i] = (int) (Math.random() * ((20 - 1) + 1)) + 1;
            }

            var operator = (int) (Math.random() * ((3 - 1) + 1)) + 1;

            switch (operator) {
                case 1:

                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " + " + arrayOfResponses[1];
                    summa [k] = arrayOfResponses[0] + arrayOfResponses[1];
                    break;
                case 2:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " - " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] - arrayOfResponses[1];
                    break;
                case 3:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " * " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] * arrayOfResponses[1];
                    break;
            }


        }
        Engine.calcPlay();
    }

    public static int[] getSumma() {
        return summa;
    }

    public static String getQuestion() {
        return question;
    }

    public static String[] getStringOfNumbers() {
        return stringOfNumbers;
    }
}



