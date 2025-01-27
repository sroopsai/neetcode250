package in.roopsai.arrays;

import java.util.Arrays;

/**
 * lc 238 Product of Array Except Self
 */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        Arrays.fill(pre, 1);
        Arrays.fill(post, 1);

        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            post[i] = post[i + 1] * nums[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < pre.length; i++) {
            result[i] = pre[i] * post[i];
        }

        return result;
    }
}
