class Solution {
    public int minimumPushes(String word) {
        int push=0;
        int[] key = new int[8];
        Arrays.fill(key,1);
        for(int i=0;i<word.length();i++){
            push+=key[i%key.length];
            if((i+1)%key.length==0){
                for(int j=0;j<key.length;j++){
                    key[j]++;
                }
            }

        }
        return push;
    }
}