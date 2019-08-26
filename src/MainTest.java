import leetcode.*;
import topcoder.*;

import java.util.Arrays;

import static leetcode.Q33.search;

public class MainTest {
    public static void main(String[] args) {

        int[] test1 = {2, 3, 1, 1, 4};
        char[][] board = {{'a', 'b', 'c', 'e'},
                          {'s', 'f', 'c', 's'},
                          {'a', 'd', 'e', 'e'}};
        System.out.println(Q45.jump(test1));
        //System.out.println(Q79.exist(board, "abcb"));
        //System.out.println("Result:" + Arrays.toString(TopographicalImage.calcPeakAreas(test)));
    }
}
