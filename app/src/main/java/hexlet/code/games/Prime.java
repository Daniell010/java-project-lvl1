package hexlet.code.games;

import hexlet.code.Engine;

import java.util.stream.IntStream;


public class Prime {
    private static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
    public static void playPrime() {

        final int columns = 3;
        final int line = 2;
        String[][] questionAnswer = new String[columns][line];
        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int randomNumber = (int) (Math.random() * ((maxVal - minVal) + minVal));
            questionAnswer[i][0] = String.valueOf(randomNumber);
            questionAnswer[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(question, questionAnswer);
    }

}
