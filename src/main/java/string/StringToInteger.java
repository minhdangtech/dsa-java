package string;

public class StringToInteger {

    public static int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isDigitNext = (i + 1 < s.length()) && Character.isDigit(s.charAt(i + 1));


            if(c == '0' && !isDigitNext) {
                sb.append("0");
                break;
            };

            if(Character.isDigit(c) && !isDigitNext) {
                sb.append(c);
                break;
            };

            if (((c == '-' || c == '+') && isDigitNext)
                    || (c == '0' && isDigitNext)
                    || Character.isDigit(c)) {
                sb.append(c);
            }



            else break;
        }

        if (sb.length() > 1) {
            if (sb.charAt(0) == '0' && sb.length() > 2) {
                sb.deleteCharAt(0);
            }

            if (sb.charAt(0) == '-' && sb.charAt(1) == '0' && sb.length() > 3) {
                sb.deleteCharAt(1);
            }

        }

        try {
            int value = Integer.valueOf(sb.toString());
        } catch (Exception e) {
                if(sb.isEmpty()) return 0;
                if(sb.charAt(0) == '-') return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
        }

        return Integer.valueOf(sb.toString());

    }




    public static void main(String[] args) {
        String s = "-13+8";
        System.out.println(myAtoi(s));
    }


}
