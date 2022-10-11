package insert_nterval;

public class Main {
    public static void main(String[] args){
        int[][] intervals={{1,2}, {3,5}, {6,7}, {8,10}, {12,16}};
        int[] newInterval = {4,8};
        Solution solution = new Solution();
        int[][] result = solution.insert(intervals, newInterval);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i][0]+" "+result[i][1]);
        }
    }
}
