// Question --> https://leetcode.com/problems/count-items-matching-a-rule/

package Arrays;

import java.util.List;

public class Matching_Rule {
    public static void main(String[] args) {
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> liat : items) {
            if (ruleKey.equals("type") && ruleValue.equals(0)) count++;
            else if (ruleKey.equals("color") && ruleValue.equals(1)) count++;
            else if (ruleKey.equals("name") && ruleValue.equals(2)) count++;
        }

        return count;
    }
}
