package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixArray = prefix(nums, n);
        int[] suffixArray = prefix(nums, n);
        for(int i = 0; i < n; i++){
            result[i] = prefixArray[i] * suffixArray[i];
        }
        return result;
    }

    private static int[] prefix(int[] nums, int n) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        return prefix;
    }

    private static int[] suffix(int[] nums, int n) {
        int[] suffix = new int[nums.length];
        suffix[n-1] = 1;
        for (int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        return suffix;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}
