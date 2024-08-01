//the question are given by the codsoft (number game) in java >>>>>

import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean tryAgain = true;
        int rounds = 0;
        int overAllscore = 0;
        while (tryAgain) {
            int number = random.nextInt(100) ;
            int attempts = 0;
            final int maximumAttempts = 10;
            boolean correctlyGuessed = false;

            System.out.println("i pick a random numberDigit between 1 and 100.");
            System.out.println("You have" + maximumAttempts + "attempts to guess the number correctly");
            while (attempts < maximumAttempts && !correctlyGuessed) {
                System.out.println("Enter your guess:");
                int guess = scanner.nextInt();
                attempts++;
                if (guess < number) {
                    System.out.println("Too low !");
                } else if (guess > number) {
                    System.out.println("Too hight !");
                } else {
                    System.out.println("you guessed the correct numberDigit" + number+ "underIn" + attempts + "attempts.");
                    correctlyGuessed = true;
                }
            }
            if (!correctlyGuessed) {
                System.out.println("Sorry you have used all"  + maximumAttempts +   "attempts.the generated numberDigit was" + number + ".");
            }
            rounds++;
            int yourScore = Math.max(0, 10 - attempts);//score based on the number of attempts taken
            overAllscore += yourScore;
            System.out.println("do you want to tryAgain?(yes/no):");
            String feedback = scanner.next();
            tryAgain = feedback.equalsIgnoreCase("yes");
        }
        System.out.println("game over!you played" + rounds + "rounds and scored" + overAllscore + "points.");
        scanner.close();
    }
}
