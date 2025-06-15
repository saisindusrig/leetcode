class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]); //by the starting value 
        //1,3   2,6   8,10  15,18
        
        List<int[]> m = new ArrayList<>();
        m.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            //take the last merged interval
            int[] last = m.get(m.size()-1); //1,3
            if(last[1]< s){ //8,10
                //no
                m.add(intervals[i]);

            }else{ //2,6
                last[1] = Math.max(last[1],e); //3,6--6 === [1,6]
            }

        }
        return m.toArray(new int[m.size()][]);
    }
}