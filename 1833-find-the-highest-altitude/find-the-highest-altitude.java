class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0]=0;
        for(int i=1;i<altitude.length;i++){
            altitude[i] = altitude[i-1]+gain[i-1];
        }
        int max=altitude[0];
        for(int i=1;i<altitude.length;i++){
            if(altitude[i]> max){
                max = altitude[i];
            }
        }
        return max;
    }
}
//gain[i]=altitude[i+1]-altitude[i]
//Find max({altitude[i]})