package practice;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = solution.groupAnagrams(strs);
        System.out.println(lists.toString());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) return result;
        for(int i=0; i<strs.length; i++){
            String sorted = this.sort(strs[i]);
            if(map.containsKey(sorted)){
                List<String> temp = map.get(sorted);
                temp.add(strs[i]);
                map.put(sorted, temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(sorted, temp);
            }
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            result.add(map.get(key));
        }
        return result;
    }

    public String sort(String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean isAnagram(String original, String given){
        if(original == null && given == null) return true;
        if(original.length() != given.length()) return false;
        int[] frequencyCount = new int[128];
        for(int i=0; i<original.length(); i++){
            int index = (int) given.charAt(i);
            frequencyCount[index]++;
        }
        for(int i=0; i<given.length(); i++){
            int index = (int) given.charAt(i);
            frequencyCount[index]--;
            if(frequencyCount[index] < 0) return false;
        }
        return true;
    }
}