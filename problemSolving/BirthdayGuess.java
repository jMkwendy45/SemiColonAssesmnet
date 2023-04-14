package problemSolving;

import java.util.Scanner;

public class BirthdayGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess my birthday Date");
        int guess = input.nextInt();

        int birthdayDate = 4;

        while (guess != birthdayDate) {
            System.out.println("Wrong please Keep Guessing");
            guess = input.nextInt();

            if (guess == birthdayDate) {
                System.out.println("Correct Answer you be better friend");
            } else {
                System.out.println("Incorrect Answer hmmmmm");

            }
        }
    }
}
