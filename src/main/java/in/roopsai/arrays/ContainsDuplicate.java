package in.roopsai.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * lc 217 Contains Duplicate
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            if (seenNumbers.contains(num)) return true;
            seenNumbers.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // true
    }
}
