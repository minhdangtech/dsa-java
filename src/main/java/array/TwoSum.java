package array;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 1};
        if(nums.length == 2) return result;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

}
