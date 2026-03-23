package hashing;

import java.util.*;
import java.util.stream.Collectors;


public class GroupAnagram {

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        return Arrays.stream(strs).collect(Collectors.groupingBy(s -> {
//          return toSortString(s);
//        }, Collectors.toList())).values().stream().toList();
//    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String key = toSortString(str);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
   public static String toSortString(String str){
       char[] chars = str.toCharArray();
       Arrays.sort(chars);
       return Arrays.toString(chars);
   }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

}
