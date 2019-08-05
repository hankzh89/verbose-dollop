package topcoder;

public class SquareOfDigits {

    // 1 4 1 6
    // 2 3 6 5
    // 1 2 1 3
    public static int getMax(String[] data) {
        int currMax = 1;
        for (int h = 0; h < data.length; h++) {
            for (int w = 0; w < data[0].length(); w++) {
                for (int i = w + currMax; i < data[0].length() && h + i - w < data.length; i++) {
                    if (data[h].charAt(w) == data[h].charAt(i)
                            && data[h].charAt(w) == data[h + i - w].charAt(w)
                            && data[h].charAt(i) == data[h + i - w].charAt(i)) {
                        currMax = Math.max(currMax, i - w + 1);
                    }
                }
            }
        }
        return currMax * currMax;
    }
}
