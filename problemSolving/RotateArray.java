package problemSolving;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(array)));
    }

    public static int[] rotateArray(int[] number) {
        for (int index = 0; index < number.length; index++) {
            for (int swap = 0; swap < number.length - index - 1; swap++) {
                int newNumber = number[swap + 1];
              System.out.println(newNumber);

            }
        }
         return  number;
    }
}