package two_pointers;

public class ValidPalindrome {
//    public static boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        int left = 0;
//        int right = s.length() - 1;
//        while(left < right) {
//            if(s.charAt(left) != s.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
