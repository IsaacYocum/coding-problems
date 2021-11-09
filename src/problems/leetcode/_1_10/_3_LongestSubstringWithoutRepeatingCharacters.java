package problems.leetcode._1_10;

public class _3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("asdfas");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String currentLongest = s.substring(0, 0);
        String current = "";

        for (int i = 1; i < s.length() + 1; i++) {
            String currentSubStr = s.substring(0, i);
            if (!current.contains(s.substring(i))) {
                current = s.substring(0, i);
                System.out.println(current);
            }



        }

        return currentLongest.length();
    }
}
