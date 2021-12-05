package problems.leetcode._11_20;

public class _13_RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        System.out.println(romanToInt(romanNumeral));
    }

    // O(n), n = length of the string
    // O(1)
    public static int romanToInt(String s) {
        int conversion = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                conversion++;
            }

            if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                conversion = (s.charAt(i) == 'V') ? conversion + 5 : conversion + 10;
                if (i - 1 >= 0 && s.charAt(i - 1) == 'I') conversion -= 2;
            }

            if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                conversion = (s.charAt(i) == 'L') ? conversion + 50 : conversion + 100;
                if (i - 1 >= 0 && s.charAt(i - 1) == 'X') conversion -= 20;
            }

            if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                conversion = (s.charAt(i) == 'D') ? conversion + 500 : conversion + 1000;
                if (i - 1 >= 0 && s.charAt(i - 1) == 'C') conversion -= 200;
            }
        }

        return conversion;
    }
}
