package leetcode;

public class Q33 {
    public static void main(String[] args) {
        int[] test = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(test, 0));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low + 1 < high) {
            // keep in mind, this way of calculating the mid can prevent the overflow.
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] < nums[mid]) {
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid;
                } else {
                    low = mid;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
        }
        if (nums[low] == target) {
            return nums[low];
        }
        if (nums[high] == target) {
            return nums[high];
        }
        return -1;
    }
}
