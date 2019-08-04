package topcoder;

public class ShorterSuperSum {

    public static int calculate(int k, int n) {
        if (k == 0) {
            return n;
        } else {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result += calculate(k - 1, i);
            }
            return result;
        }
    }
}
