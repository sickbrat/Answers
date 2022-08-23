// Question --> https://leetcode.com/problems/shuffle-the-array/

package Arrays;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;

        for (int i = 0; i < 2 * n; i += 2) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
            j++;
        }
        return ans;
    }
}
