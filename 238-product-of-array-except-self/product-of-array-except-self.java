class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];
        int left = 1;
        // product of each element from left
        for (int i = 0; i < n; i++) {
            newArr[i] = left;
            left *= nums[i];
        }
        int right = 1;
        // product of each element through right
        for (int i = n - 1; i >= 0; i--) {
            newArr[i] *= right;
            right *= nums[i];
        }

        return newArr;
    }
}