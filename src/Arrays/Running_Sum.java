// Question --> https://leetcode.com/problems/running-sum-of-1d-array/

package Arrays;

import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(running(arr)));
    }
    static int[] running(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
