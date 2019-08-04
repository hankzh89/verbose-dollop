package leetcode;

public class Q832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int height = image.length;
        int width = image[0].length;
        int[][] result = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width && j <= (width - 1) / 2; j++) {
                if (j == width - j - 1) {
                    result[i][j] = image[i][j] == 0 ? 1 : 0;
                } else {
                    if (image[i][j] == image[i][width - j - 1]) {
                        result[i][j] = result[i][width - j - 1] = image[i][j] == 0 ? 1 : 0;
                    } else {
                        result[i][j] = image[i][j];
                        result[i][width - j - 1] = image[i][width - j - 1];
                    }
                }
            }
        }
        return result;
    }
}
