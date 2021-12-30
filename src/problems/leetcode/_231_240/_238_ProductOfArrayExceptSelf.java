package problems.leetcode._231_240;

public class _238_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
//        int[] test = {1, 2, 3, 4};
        int[] test = {-1, 1, 0, -3, 3};
        int[] result = productExceptSelf(test);
        System.out.println(result);
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output = new int[N];

        output[0] = 1;

        for (int i = 1; i < N; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }
}
