package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String question = "What is the result of the expression?";
    private static String[] stringOfNumbers = new String[Engine.getVictoryCount()];
    private static int[] summa = new int[Engine.getVictoryCount()];

    public static void playCalc() {
        for (int k = 0; k < Engine.getVictoryCount(); k++){
            int[] arrayOfResponses = new int[2];
            final int MAX_VAL = 20;
            final int MIN_VAL = 1;
            final int MAX_OP = 3;
            for (int i = 0; i < arrayOfResponses.length; i++) {
                arrayOfResponses[i] = (int) (Math.random() * ((MAX_VAL - MIN_VAL) + MIN_VAL)) + MIN_VAL;
            }

            var operator = (int) (Math.random() * ((MAX_OP - MIN_VAL) + MIN_VAL)) + MIN_VAL;

            switch (operator) {
                case 1:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " + " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] + arrayOfResponses[1];
                    break;
                case 2:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " - " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] - arrayOfResponses[1];
                    break;
                case 3:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " * " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] * arrayOfResponses[1];
                    break;
                default:
                    System.out.println("there is no such sign");
                    return;
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



