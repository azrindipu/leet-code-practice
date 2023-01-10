package slidingWindow.Best_Time_to_Buy_and_Sell_Stock.Longest_Repeating_Character_Replacement;

import java.util.HashMap;
import java.util.Map;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args){
        String s= "AABABBA";
        Solution solution = new Solution();
        System.out.println(solution.characterReplacement(s, 1));
    }
}

class Solution {
    /*public int characterReplacement(String s, int k) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency =1;
        int slow =0;
        int fast =0;
        int result =0;
        while (s.length() > fast){
            char ch = s.charAt(fast);
            if(frequencyMap.containsKey(ch)){
                int currentFrequency = frequencyMap.get(ch);
                frequencyMap.put(ch, currentFrequency + 1);
                maxFrequency = Math.max(maxFrequency, currentFrequency+1);
            }else{
                frequencyMap.put(ch,1);
            }
            int charLen = (fast-slow)+1;
            if(charLen-maxFrequency <= k){
                result = Math.max(result, charLen);
            }else{
                frequencyMap.put(s.charAt(slow), frequencyMap.get(s.charAt(slow))-1);
                slow++;
            }
            fast++;
        }
        return result;
    }*/

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int slow =0;
        int fast =0;
        int result =0;
        int maxf=1;
        while (fast < s.length()){
            char ch = s.charAt(fast);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch, count+1);
                maxf = Math.max(maxf, count+1);
            }else{
                map.put(ch, 1);
            }
            int len = (fast-slow)+1;
            if(len - maxf <= k) result = Math.max(result, len);
            else{
                map.put(s.charAt(slow), map.get(s.charAt(slow))-1);
                slow++;
            }
            fast++;
        }
        return result;
    }
}
