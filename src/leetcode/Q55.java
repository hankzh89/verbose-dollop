package leetcode;

public class Q55 {
    public static boolean canJump(int[] nums) {
        int[] steps = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            steps[i] = Integer.MAX_VALUE;
        }
        steps[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (steps[i] == Integer.MAX_VALUE) {
                continue;
            }
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                if (steps[i + j] > steps[i] + j) {
                    steps[i + j] = steps[i] + j;
                }
            }
        }
        return steps[nums.length - 1] != Integer.MAX_VALUE;
    }
}
