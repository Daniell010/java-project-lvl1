package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String question = "What is the result of the expression?";
    private static String[] stringOfNumbers = new String[Engine.getVictoryCount()];
    private static int[] summa = new int[Engine.getVictoryCount()];

    public static void playCalc() {
        for (int k = 0; k < Engine.getVictoryCount(); k++) {
            int[] arrayOfResponses = new int[2];
            final int maxVal = 20;
            final int minVal = 1;
            final int maxOp = 3;
            for (int i = 0; i < arrayOfResponses.length; i++) {
                arrayOfResponses[i] = (int) (Math.random() * ((maxVal - minVal) + minVal)) + minVal;
            }

            var operator = (int) (Math.random() * ((maxOp - minVal) + minVal)) + minVal;
            final var one = 1;
            final var two = 2;
            final var three = 3;

            switch (operator) {
                case one:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " + " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] + arrayOfResponses[1];
                    break;
                case two:
                    stringOfNumbers[k] = "Question: " + arrayOfResponses[0] + " - " + arrayOfResponses[1];
                    summa[k] = arrayOfResponses[0] - arrayOfResponses[1];
                    break;
                case three:
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
