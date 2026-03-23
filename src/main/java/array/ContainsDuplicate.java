package array;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> table = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(table.contains(nums[i])) return true;
            else table.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        System.out.println(containsDuplicate(arr));
    }

}
