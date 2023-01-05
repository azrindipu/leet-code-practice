package Array.Group_Anagrams;

import java.util.ArrayList;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result.toString());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            if(visited[i]) continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            visited[i]=true;
            for(int j=i+1; j<strs.length; j++){
                if(!visited[j]){
                    if(this.isAnagram(strs[i], strs[j])){
                        temp.add(strs[j]);
                        visited[j] = true;
                    }
                }
            }
            result.add(temp);
        }
        return result;
    }

    private boolean isAnagram(String string1, String string2){
        if(string1 == null && string2 == null) return true;
        if(string1 == null || string2 == null) return false;
        if(string1.length() != string2.length()) return false;
        int[] frequencyCount = new int[128];
        for(int i=0; i<string1.length(); i++){
            int index = (int)string1.charAt(i);
            frequencyCount[index]++;
        }
        for(int i=0; i<string2.length(); i++){
            int index = (int)string2.charAt(i);
            frequencyCount[index]--;
            if(frequencyCount[index] <0) return false;
        }
        return true;
    }
}
