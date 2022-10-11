package merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (e1, e2) -> Integer.compare(e1[0], e2[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] lastElement = list.get(list.size()-1);
            if(lastElement[1] >= intervals[i][0]){
                lastElement[1]=Math.max(lastElement[1], intervals[i][1]);
                list.remove(list.size()-1);
                list.add(lastElement);
            }else{
                list.add(intervals[i]);
            }
        }
        int[][] result = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
