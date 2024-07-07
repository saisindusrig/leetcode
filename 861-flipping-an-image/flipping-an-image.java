class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {
                image[r][c] = image[r][c] == 1 ? 0 : 1;
            }
        }

        for (int r = 0; r < image.length; r++) {
            int left = 0, right = image[r].length - 1;
            while (left < right) {
                int temp = image[r][left];
                image[r][left] = image[r][right];
                image[r][right] = temp;
                left++;
                right--;
            }
        }

        return image;
    }
}
