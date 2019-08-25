package leetcode;

public class Q905 {
    public static int[] sortArrayByParity(int[] a) {
        int evenP = 0;
        int oddP = 1;
        while (evenP < a.length) {
            if (a[evenP] % 2 != 0) {
                while (oddP < a.length && a[oddP] % 2 != 0) {
                    ++oddP;
                }
                if (oddP >= a.length) {
                    break;
                }
                int tmp = a[evenP];
                a[evenP] = a[oddP];
                a[oddP] = tmp;
            }
            ++evenP;
            oddP = oddP <= evenP ? evenP + 1 : oddP;
        }
        return a;
    }
}
