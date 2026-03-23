package array;

import java.util.Arrays;
import java.util.Random;

public class SortAnArray {

    private Random rand = new Random();
    static   int[] sortArray(int[] nums) {
        quickSort(nums, 0 , nums.length - 1);
        return nums;
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex +  1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low ; j < high ; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }



    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 4, 3};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

}
