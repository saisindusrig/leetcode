class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] v = new int[k];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int n:nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }
       PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
       for(Map.Entry<Integer,Integer> e : h.entrySet()){
        q.offer(new int[] {e.getValue(),e.getKey()});
        if(q.size()>k) q.poll();
       }
       for(int i=k-1;i>=0;i--) v[i]= q.poll()[1]; //first to last
       return v;
    }
}