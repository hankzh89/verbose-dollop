package topcoder;

public class ProblemsToSolve {
    private static int[] p;

    private static int minNumber(int start, int currVar) {
        if (currVar <= 0) {
            return 1;
        }
        if (start >= p.length - 2) {
            return p.length - start;
        }
        int i1 = minNumber(start + 1, currVar - Math.abs(p[start] - p[start + 1]));
        int i2 = minNumber(start + 2, currVar - Math.abs(p[start] - p[start + 2]));
        return Math.min(i1, i2) + 1;
    }

    public static int minNumber(int[] pleasantness, int variety) {
        p = pleasantness;
        return minNumber(0, variety);
    }

}
