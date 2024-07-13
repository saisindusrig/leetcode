class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        //minimum element in its row and maximum in its column.
        for(int i=0;i<matrix.length;i++){
            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=0;j<matrix[i].length;j++){ //max in colomum
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minIndex = j;
                }
            }boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minVal) {
                    isMaxInCol = false;
                    
                }
            }

            if (isMaxInCol) {
                luckyNumbers.add(minVal);
            }
        }

        return luckyNumbers;
        }
    }
