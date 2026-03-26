package array;

import java.util.*;

public class MoveZeroes {

    static int[] input = {0,1,0,3,12};
    static int[] output = {1,3,12,0,0};

    public static void moveZeros (int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0) j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isEqual(int[] input, int[] output) {
        return Arrays.equals(input, output);
    }

    public static void main(String[] args) {
        moveZeros(input);
        System.out.println(isEqual(input, output));
    }

}
