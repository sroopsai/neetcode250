package in.roopsai.arrays;

import java.util.Arrays;

/**
 * lc 1929. Concatenation of Array
 * i/p: nums = [1,2,1]
 * o/p: [1,2,1,1,2,1]
 */
public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        for(int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[n + i] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
}
