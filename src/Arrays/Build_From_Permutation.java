//  Question --> https://leetcode.com/problems/build-array-from-permutation/

package Arrays;

import java.util.Arrays;

public class Build_From_Permutation {
    public static void main(String[] args) {
        int[] num = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(array_per(num)));
    }
    static int[] array_per(int[] numbs) {
        int[] ans = new int[numbs.length];

        for (int i = 0; i < numbs.length; i++) {
            ans[i] = numbs[numbs[i]];
        }
        return ans;
    }
}
