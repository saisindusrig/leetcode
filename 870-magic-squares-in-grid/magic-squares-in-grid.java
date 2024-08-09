class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isMagic(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagic(int[][] grid, int i, int j) {
        int[] nums = new int[9];
        boolean[] seen = new boolean[16];

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                nums[k * 3 + l] = grid[i + k][j + l];
                if (nums[k * 3 + l] < 1 || nums[k * 3 + l] > 9 || seen[nums[k * 3 + l]]) {
                    return false;
                }
                seen[nums[k * 3 + l]] = true;
            }
        }

        int target = nums[0] + nums[1] + nums[2];
        if (nums[3] + nums[4] + nums[5] != target) return false;
        if (nums[6] + nums[7] + nums[8] != target) return false;
        if (nums[0] + nums[3] + nums[6] != target) return false;
        if (nums[1] + nums[4] + nums[7] != target) return false;
        if (nums[2] + nums[5] + nums[8] != target) return false;
        if (nums[0] + nums[4] + nums[8] != target) return false;
        if (nums[2] + nums[4] + nums[6] != target) return false;

        return true;
    }
}