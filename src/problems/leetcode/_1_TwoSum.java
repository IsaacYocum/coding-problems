package problems.leetcode;

import java.util.Arrays;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] example = new int[]{-3, 4, 3, 90};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(example, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //System.out.println(nums[i] + " + " + nums[j] + " = " + (nums[i] + nums[j]));
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
