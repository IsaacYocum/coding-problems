package problems.leetcode._11_20;

public class _14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "flow";
        arr[1] = "reflower";
        arr[2] = "flight";

        String lcp = longestCommonPrefix(arr);
        System.out.println(lcp);

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();

//        String shortestWord = strs[0];
//        for (String str : strs) {
//            if (str.length() < shortestWord.length()) shortestWord = str;
//        }
//
//        if (shortestWord.isEmpty()) return "";
//        System.out.println(shortestWord);

        boolean isCommonLetter = true;
        char currentLetter;

        for (int i = 0; i < strs[0].length(); i++) {
            currentLetter = strs[0].charAt(i);

            for (String str : strs) {
                isCommonLetter = currentLetter == str.charAt(i);
                if (!isCommonLetter) break;
            }

            if (isCommonLetter) {
                commonPrefix.append(currentLetter);
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}
