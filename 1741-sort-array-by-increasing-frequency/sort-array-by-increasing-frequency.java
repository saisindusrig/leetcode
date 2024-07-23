class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i :nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }    
        List<Integer> n = new ArrayList<>();
        for(int i:nums){
            n.add(i);
        }
        Collections.sort(n, (a, b) -> freq.get(a) - freq.get(b) == 0? b - a : freq.get(a) - freq.get(b));
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = n.get(i);
        }
        return result;
    }
}