class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int rS=0,rE=arr.length-1,cS=0,cE= arr[0].length-1,count=1;
        while(rS<=rE && cS<=cE){
            for(int i=cS;i<=cE;i++){
                arr[rS][i]=count++;
            }
            rS++; //1
            for(int j=rS;j<=rE;j++){
                arr[j][cE] =count++;
            }
            cE--;
            if(rS<=rE){
                for(int i=cE;i>=cS;i--){
                    arr[rE][i]=count++;
                }
                rE--;
            }if(cS<=cE){
                for(int i=rE;i>=rS;i--){
                    arr[i][cS] = count++;
                }
                cS++;
            }
        }
        return arr;
    }
}