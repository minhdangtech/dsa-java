package array;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int longest = 0;
        for (int n : set){
            if(!set.contains(n - 2)) {
                int curr = n;
                int length = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

}
