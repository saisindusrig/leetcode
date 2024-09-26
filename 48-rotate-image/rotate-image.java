class Solution {
    public void rotate(int[][] matrix) {
        // take transpose and then reverse
        // transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[j][i]; // swap
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        // reverse
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[i].length - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;

            }
        }

    }
}