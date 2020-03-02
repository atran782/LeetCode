import java.util.Arrays;

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

public class LeetCode_1365 {

    public static void main(String[] args) {
        int[] nums = new int[]{6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
