package hexlet.code.games;

import hexlet.code.Engine;

import java.util.stream.IntStream;


public class Prime {

    public static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }


    public static void playPrime() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAnswer = new String[3][2];

        final int maxVal = 100;
        final int minVal = 1;
        for (int i = 0; i < Engine.COUNT_ROUNDS; i++) {
            int randomNumber = (int) (Math.random() * ((maxVal - minVal) + minVal));
            questionAnswer[i][0] = ("Question: " + randomNumber);
            if (isPrime(randomNumber)) {
                questionAnswer[i][1] = "yes";
            } else {
                questionAnswer[i][1] = "no";
            }
        }
        Engine.runGame(question,questionAnswer);
    }

}
