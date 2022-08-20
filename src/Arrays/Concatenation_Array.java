// Question --> https://leetcode.com/problems/concatenation-of-array/

package Arrays;

import java.util.Arrays;

public class Concatenation_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(Arrays.toString(concatenation(arr)));
    }
    static int[] concatenation(int[] numbs) {
        int[] ans = new int[2 * numbs.length]; // Created an array named 'ans' which is twice the length of 'numbs' array.

        for (int i = 0; i < numbs.length; i++) {
            ans[i] = numbs[i];
            ans[i + numbs.length] = numbs[i];
        }
        return ans;
    }
}
