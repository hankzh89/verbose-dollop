package topcoder;

import java.util.ArrayList;
import java.util.List;

public class TopographicalImage {
    private static int highest = -1, highestX = 0, highestY = 0;
    private static String[] map;
    private static boolean[][] peaked;

    private static boolean getPeakPoint() {
        highest = -1;
        boolean gotHighest = false;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length(); j++) {
                if (!peaked[j][i] && map[i].charAt(j) > highest) {
                    gotHighest = true;
                    highest = map[i].charAt(j);
                    highestX = j;
                    highestY = i;
                }
            }
        }
        return gotHighest;
    }

    private static int peak(int x, int y, int h) {
        if (x < 0 || x >= map[0].length() || y < 0 || y >= map.length
                || peaked[x][y] || map[y].charAt(x) > h) {
            return 0;
        }
        peaked[x][y] = true;
        int height = map[y].charAt(x);
        //1 + L + LD + D + RD + R + RU + U + LU
        return 1 + peak(x - 1, y, height) + peak(x - 1, y + 1, height)
                + peak(x, y + 1, height) + peak(x + 1, y + 1, height)
                + peak(x + 1, y, height) + peak(x + 1, y - 1, height)
                + peak(x, y - 1, height) + peak(x - 1, y - 1, height);
    }

    public static int[] calcPeakAreas(String[] topoData) {
        map = topoData;
        peaked = new boolean[map[0].length()][map.length];
        List<Integer> resultList = new ArrayList<>();
        while (getPeakPoint()) {
            resultList.add(peak(highestX, highestY, highest));
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}