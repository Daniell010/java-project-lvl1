package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static String question = "Find the greatest common divisor of given numbers.";
    public static int[] arrayGCD = new int[3];
    public static  String[] task = new String[3];
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void playGCD ()
    {
        for (int k = 0; k < 3; k++) {
            int[] arrayNum = new int[2];
            for (int i = 0; i < arrayNum.length; i++) {
                arrayNum[i] = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            }
            task[k] = "Question: " + arrayNum[0] + " " + arrayNum[1];
            arrayGCD[k] = gcd(arrayNum[0],arrayNum[1]);

        }
        Engine.GCDplay();
    }
}
