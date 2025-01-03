class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hp = new HashMap<>();
        for (int a : nums) {
            hp.put(a, hp.getOrDefault(a, 0) + 1);
        }
        int majorityCount = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : hp.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }
       
        return -1; 
    }
}
