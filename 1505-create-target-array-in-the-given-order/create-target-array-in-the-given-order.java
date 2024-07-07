class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> newt = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            newt.add(index[i],nums[i]);
        }
        int[] target = new int[newt.size()];
        for(int i=0;i<nums.length;i++){
            target[i] = newt.get(i);
        }
        return target;

}
        
}
