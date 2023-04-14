package problemSolving;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to input");
        int number = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i <= number; i++) {
            System.out.println("Enter a number");
            int numberValue = input.nextInt();

            if (numberValue > largest) {
                secondLargest=largest;
                largest = numberValue;
            } else if (numberValue > secondLargest && numberValue != largest) {
                secondLargest = numberValue;
            }
        }
        System.out.println("The second largest is"+secondLargest);

    }
}