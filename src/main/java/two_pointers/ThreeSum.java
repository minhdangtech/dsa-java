package two_pointers;

import java.util.*;

public class ThreeSum {

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        Set<List<Integer>> set = new HashSet<>();
//        List<List<Integer>> res = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            int x = -nums[i];
//            int left = i + 1;
//            int right= n - 1;
//            while (left < right) {
//                int sum = nums[left] + nums[right];
//                if(sum == x && !set.contains(List.of(nums[i], nums[left], nums[right]))) {
//                   res.add(List.of(nums[i], nums[left], nums[right]));
//                   set.add(List.of(nums[i], nums[left], nums[right]));
//                }else if(sum < x) {
//                  left++;
//                }else {
//                    right--;
//                }
//            }
//        }
//        return res;
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int x = -nums[i];
            int left = i + 1;
            int right= n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if(sum == x) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }else if(sum < x) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        System.out.println(threeSum(arr));
    }

}
