class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int rs=0,re=matrix.length-1,cs=0,ce=matrix[0].length-1;
        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                arr.add(matrix[rs][i]);
            }
            rs++;
            for(int j=rs;j<=re;j++){
                arr.add(matrix[j][ce]);
            }
            ce--;
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    arr.add(matrix[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                    arr.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return arr;
        
    }
}
