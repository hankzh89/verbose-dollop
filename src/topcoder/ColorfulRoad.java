package topcoder;

public class ColorfulRoad {
    private static final int MAX = 99999; //Using Integer.MAX_VALUE will overflow.
    private static boolean validNext(char curr, char next) {
        if (curr == 'R') {
            return next == 'G';
        } else if (curr == 'G') {
            return next == 'B';
        } else if (curr == 'B') {
            return next == 'R';
        }
        return false;
    }

    public static int getMin(String road) {
        int[] costs = new int[road.length()];
        for (int i = 0; i < road.length(); i++) {
            costs[i] = MAX;
        }
        costs[0] = 0;
        for (int i = 0; i < road.length(); i++) {
            for (int j = i + 1; j < road.length(); j++) {
                if (validNext(road.charAt(i), road.charAt(j))) {
                    int curr_cost = costs[i] + (j - i) * (j - i);
                    costs[j] = costs[j] > curr_cost ? curr_cost : costs[j];
                }
            }
        }
        return costs[road.length() - 1] == MAX ? -1 : costs[road.length() - 1];
    }
}
