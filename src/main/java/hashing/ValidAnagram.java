package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//        HashMap<Character, Integer> mapForS = new HashMap<>();
//        HashMap<Character, Integer> mapForT = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            mapForS.merge(s.charAt(i), 1, Integer::sum);
//            mapForT.merge(t.charAt(i), 1, Integer::sum);
//        }
//        return mapForS.equals(mapForT);
//    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagramm", "nagaram"));
    }

}
