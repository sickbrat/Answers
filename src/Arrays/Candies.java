// Question --> https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length, maxCandies = 0;

        for (int i = 0; i < n; i++)
            if (candies[i] > maxCandies)
                maxCandies = candies[i];

        List<Boolean> output = new ArrayList<>();

        for (int i = 0; i < n; i++)
            if (candies[i] + extraCandies < maxCandies) {
                output.add(false);
            } else {
                output.add(true);
            }

        return output;
    }
}
