package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if(sum == target){
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            }
            else if(sum < target) left++;
            else right--;
        }
        return res;
    };

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
