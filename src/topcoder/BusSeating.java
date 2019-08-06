package topcoder;

public class BusSeating {
    private static String left;
    private static String right;

    private static char getChar(int i) {
        if (i < left.length()) {
            return left.charAt(i);
        }
        return right.charAt(i - left.length());
    }

    //assuming j is greater.
    private static double cal(int i, int j) {
        if ((i < left.length() && j < left.length())
                ||(i >= left.length() && j >= left.length())) {
            return Math.abs(i - j);
        } else {
            int tmp = Math.abs((j - left.length()) - i);
            return Math.sqrt(tmp * tmp + 4);
        }
    }

    public static double getArrangement(String leftRow, String rightRow) {
        left = leftRow;
        right = rightRow;
        double result = Integer.MAX_VALUE;
        for (int i = 0; i < leftRow.length() + rightRow.length(); i++) {
            if (getChar(i) == 'X') {
                continue;
            }
            for (int j = i + 1; j < leftRow.length() + rightRow.length(); j++) {
                if (getChar(j) == 'X') {
                    continue;
                }
                for (int k = j + 1; k < leftRow.length() + rightRow.length(); k++) {
                    if (getChar(k) == 'X') {
                        continue;
                    }
                    double dis1 = cal(i, j);
                    double dis2 = cal(i, k);
                    double dis3 = cal(j, k);
                    result = Math.min(result, (dis1 + dis2 + dis3));
                }
            }
        }
        return result;
    }
}

