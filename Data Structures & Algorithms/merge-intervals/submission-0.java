class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length == 0 || intervals == null)
            return intervals;

 Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
 List<int[]> merged = new ArrayList<>();
 int[] results = intervals[0];
 merged.add(results);

 for(int[] interval : intervals)
 {
    int currentEnd = results[1];
    int nextStart = interval[0];
    int nextEnd = interval[1];

    if(nextStart <= currentEnd){
        results[1] = Math.max(currentEnd,nextEnd);
    }
    else{
        results = interval;
        merged.add(results);
    }


 }
     return merged.toArray(new int[merged.size()][]);   
    }
}
