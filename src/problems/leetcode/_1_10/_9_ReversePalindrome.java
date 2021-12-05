package problems.leetcode._1_10;

public class _9_ReversePalindrome {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(101);
        System.out.println(palindrome);
    }

    // TC O(n)
    // SC O(n)
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String candidate = String.valueOf(x);
        StringBuilder revCandidate = new StringBuilder();

        for (int i = candidate.length(); i > 0; i--)
            revCandidate.append(candidate.charAt(i - 1));

        return candidate.equals(revCandidate.toString());
    }
}
