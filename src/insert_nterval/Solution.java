package insert_nterval;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        boolean isAdded=false;
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] > newInterval[1]){
                list.add(newInterval);
                for(int j=i; j<intervals.length; j++){
                    list.add(intervals[j]);
                }
                isAdded=true;
                break;
            }
            else if(intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
            }
            else{
                newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
            }
        }
        if(!isAdded){
            list.add(newInterval);
        }
        int[][] result = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            result[i][0]=list.get(i)[0];
            result[i][1]=list.get(i)[1];
        }
        return result;
    }
}
