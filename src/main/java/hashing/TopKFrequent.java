package hashing;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
       int[] nums = {1,1,1,2,2,3};
       int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));;
    }

}
