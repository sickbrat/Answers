// Question --> https://leetcode.com/problems/find-the-highest-altitude/

package Arrays;

public class Highest_Altitude {
    public static void main(String[] args) {
        int[] arr = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int hp = 0;
        int p = 0;

        for (int i = 0; i < gain.length; i++) {
            p += gain[i];
            hp = Math.max(p, hp);
        }

        return hp;
    }
}
