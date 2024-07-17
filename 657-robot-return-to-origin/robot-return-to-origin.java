class Solution {
    public boolean judgeCircle(String moves) {
        //take(x,y)
        int x=0;
        int y=0;
        for (char i : moves.toCharArray()){
            if(i=='U'){
                x+=1;
            }if(i=='D'){
                x-=1;
            }if(i=='R'){
                y+=1;
            }if(i=='L'){
                y-=1;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}