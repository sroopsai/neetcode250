package in.roopsai.arrays;

/**
 * lc 169 Majority Element
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count = 0;
        int majority = Integer.MAX_VALUE;
        for (int num : nums) {
            if (count == 0) majority = num;
            if (num == majority) count++;
            else count--;
        }

        return majority;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
