package slidingWindow.Best_Time_to_Buy_and_Sell_Stock.Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int fast = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        while (s.length() > fast) {
            if (!set.contains(s.charAt(fast))) {
                set.add(s.charAt(fast));
                fast++;
                maxLength = Math.max(maxLength, fast - slow);
            } else {
                set.remove(s.charAt(slow));
                slow++;
            }
        }
        return maxLength;
    }
}
