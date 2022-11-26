package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static void runGame(String question, String[][] questionAnswer) {

       var name = Cli.writeName();
       System.out.println(question);
       Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < COUNT_ROUNDS; i++) {
            System.out.println(questionAnswer[i][0]);
            System.out.print("Your answer: ");
           var userInput = scanner.next();
           if (userInput.equals(questionAnswer[i][1])) {
                System.out.println("Correct!");
           } else {
                System.out.println("'" + userInput + "'is wrong answer ;(. Correct answer was '"
                        + questionAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

        }
       scanner.close();
        System.out.println("Congratulations, " + name + "!");

    }
}
