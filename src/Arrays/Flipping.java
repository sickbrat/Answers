// Question --> https://leetcode.com/problems/flipping-an-image/

package Arrays;

import java.util.Arrays;

public class Flipping {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 1, 0 }
        };
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int column = image[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (column + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][column - 1 - j] ^ 1;
                image[i][column - 1 - j] = temp;
            }
        }

        return image;
    }
}
