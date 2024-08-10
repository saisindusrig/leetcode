class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i]; //finding the other number 
            if(maps.containsKey(rem)){ //if other num is present the combination is right!
                return new int[] {maps.get(rem),i}; //get their indexes
            }
            maps.put(nums[i],i); //if not right put them in the hashmap.
        }
        return new int[0];
    }
}