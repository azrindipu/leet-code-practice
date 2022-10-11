package merge_intervals;

public class Main {
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Solution solution = new Solution();
        int[][] result = solution.merge(intervals);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i][0]+" "+result[i][1]);
        }
    }
}
