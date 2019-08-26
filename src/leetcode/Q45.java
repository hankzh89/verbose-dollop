package leetcode;

public class Q45 {
    public static int jump(int[] nums) {
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
                    steps[i + j] = steps[i] + 1;
                }
            }
        }
        return steps[nums.length - 1];
    }
}
