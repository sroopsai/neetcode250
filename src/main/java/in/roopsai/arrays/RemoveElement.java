package in.roopsai.arrays;

/**
 * lc 27 Remove Element
 *
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] != val) {
                i++;
            } else if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                } else {
                    swap(nums, i, j);
                }
            }
        }
        return i;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int val = 3;
        int answer = removeElement(nums, val);
        for (int i = 0; i < answer; i++) {
            System.out.println(nums[i]);
        }

    }

}
