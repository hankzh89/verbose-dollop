package topcoder;

public class UnsealTheSafe {
    public static long countPasswords(int N) {
        int[][] counts = new int[31][10];
        for (int i = 0; i < 10; i++) {
            counts[1][i] = 1;   //count of passwords containing 1 digit end with i
        }
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // 0
        for (int i = 2; i <= N; i++) {
            counts[i][0] = counts[i - 1][7];
            counts[i][1] = counts[i - 1][2] + counts[i - 1][4];
            counts[i][2] = counts[i - 1][1] + counts[i - 1][3] + counts[i - 1][5];
            counts[i][3] = counts[i - 1][2] + counts[i - 1][6];
            counts[i][4] = counts[i - 1][1] + counts[i - 1][5] + counts[i - 1][7];
            counts[i][5] = counts[i - 1][2] + counts[i - 1][4] + counts[i - 1][6] + counts[i - 1][8];
            counts[i][6] = counts[i - 1][3] + counts[i - 1][5] + counts[i - 1][9];
            counts[i][7] = counts[i - 1][4] + counts[i - 1][8] + counts[i - 1][0];
            counts[i][8] = counts[i - 1][5] + counts[i - 1][7] + counts[i - 1][9];
            counts[i][9] = counts[i - 1][6] + counts[i - 1][8];
            counts[i][0] = counts[i - 1][7];
        }
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += counts[N][i];
        }
        return result;
    }
}
