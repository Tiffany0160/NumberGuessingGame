package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int secret = rand.nextInt(10) + 1;
        int guess = 0;

        while (guess != secret) {
            System.out.print("Guess number (1-10): ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! 🎉");
            }
        }

        sc.close();
    }
}
