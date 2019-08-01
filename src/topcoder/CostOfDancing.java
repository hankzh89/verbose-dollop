package topcoder;

public class CostOfDancing {
    private static void sort1(int[] array) {
        boolean swapped = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapped = true;
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static int minimum(int k, int[] danceCost) {
        int result = 0;

        for (int i = 0; i < k; i++) {
            result += danceCost[i];
        }
        return result;
    }
}
