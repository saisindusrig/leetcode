class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>(); 
        for(int i=0;i<matrix.length;i++){
            int minValue = Integer.MAX_VALUE;
            int minIn = -1;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]< minValue){
                    minValue = matrix[i][j];
                    minIn =j;
                }
            } 
            boolean isLucky= true;
             for(int m=0;m<matrix.length;m++){
                if(matrix[m][minIn]>minValue){
                    isLucky = false;
                }
            }
            if(isLucky){
                luckyNums.add(minValue);
            }
        }
        return luckyNums;

        }
    }
