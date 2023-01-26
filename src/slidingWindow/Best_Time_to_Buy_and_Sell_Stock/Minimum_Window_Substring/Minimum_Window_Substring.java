package slidingWindow.Best_Time_to_Buy_and_Sell_Stock.Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {
    public static void main(String[] args){
        String s = "kgfidhkt";
        String t = "tjcwa";
        Solution solution = new Solution();
        System.out.println(solution.minWindow(s, t));
    }
}

class Solution {
    public String minWindow(String s, String t) {
        if(t == null || t=="" || t.length() == 0 ) return "";
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        int resultPointerLeft=Integer.MIN_VALUE, resultPointerRight=Integer.MAX_VALUE, resultLength=Integer.MAX_VALUE,need=0,have=0, left=0;
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(tMap.containsKey(ch)){
                tMap.put(ch, tMap.get(ch)+1);
            }else{
                tMap.put(ch, 1);
            }
        }
        need=tMap.size();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(sMap.containsKey(ch)){
                sMap.put(ch, sMap.get(ch)+1);
            }else{
                sMap.put(ch, 1);
            }
            if(tMap.containsKey(ch) && sMap.get(ch) == tMap.get(ch)){
                have++;
            }
            if(need == have){
                while (need == have){
                    int len = (i-left) +1;
                    if(len < resultLength){
                        resultLength = len;
                        resultPointerLeft = left;
                        resultPointerRight = i;
                    }
                    if(tMap.containsKey(s.charAt(left))){
                        sMap.put(s.charAt(left), sMap.get(s.charAt(left))-1);
                        if(sMap.get(s.charAt(left)) < tMap.get(s.charAt(left))){
                            have--;
                        }
                    }
                    left++;
                }
            }
        }
        return (resultLength == Integer.MAX_VALUE || resultPointerLeft == Integer.MIN_VALUE || resultPointerRight == Integer.MAX_VALUE)? "":
                s.substring(resultPointerLeft, resultPointerRight+1);
    }
}