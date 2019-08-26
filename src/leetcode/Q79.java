package leetcode;

public class Q79 {
    private static char[][] b;
    private static boolean[][] v;
    private static String w;

    private static boolean equal(int m, int n, char c) {
        return m >= 0 && m < b.length && n >= 0 && n < b[0].length
                && !v[m][n] && b[m][n] == c;
    }

    private static boolean valid(int m, int n, String word) {
        if (b[m][n] != word.charAt(0)) {
            return false;
        }
        if (word.length() == 1 && b[m][n] == word.charAt(0)) {
            return true;
        }
        v[m][n] = true;
        //up
        if (equal(m - 1, n, word.charAt(1))
                && valid(m - 1, n, word.substring(1))) {
            return true;
        }
        //right
        if (equal(m, n + 1, word.charAt(1))
                && valid(m, n + 1, word.substring(1))) {
            return true;
        }
        //down
        if (equal(m + 1, n, word.charAt(1))
                && valid(m + 1, n, word.substring(1))) {
            return true;
        }
        //left
        if (equal(m, n - 1, word.charAt(1))
                && valid(m, n - 1, word.substring(1))) {
            return true;
        }
        v[m][n] = false;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        b = board;
        w = word;
        v = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && valid(i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
