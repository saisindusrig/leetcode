class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] v = new int[k];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int n:nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for(Map.Entry<Integer,Integer> m : h.entrySet()){
            pq.offer(new int[]{m.getValue(),m.getKey()});
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(int i=k-1;i>=0;i--){
            v[i]= pq.poll()[1];
        }
        return v;
    }
}