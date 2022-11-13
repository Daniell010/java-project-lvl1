package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void playEven()
    {
        Scanner scanner = new Scanner(System.in);
        var choice = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (true)
        {
            var x =(int)(Math.random()*((100-1)+1))+1;
            var ev = x % 2 == 0;
            System.out.println("Question: " + x);
            var a = scanner.next();
            if(a.equals("yes")) // сравниваем ввод пользовтеля
            {
                if(ev)  // четное?
                {
                    System.out.println("Correct!");
                    choice++;
                    if (choice == 3)
                    {
                        System.out.println("Congratulations, " + Cli.name);
                        return;
                    }
                }
                else
                {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    return;
                }
            }
            else if (a.equals("no"))
            {
                if(!ev)  //нечетное?
                {
                        System.out.println("Correct!");
                        choice++;
                        if (choice == 3) {
                            System.out.println("Congratulations, " + Cli.name);
                            return;
                        }
                }
                else
                {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    return;
                }
            }
            else
            {
                System.out.println("'" + a + "' is wrong answer ;(. Correct answer was 'no'.");
                return;
            }

        }


    }
}
