class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char i:word.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1); //get freq
        }
        List<Integer> desc = new ArrayList<>(freq.values());
        Collections.sort(desc,Collections.reverseOrder());
        int push=0;
        int[] keypush= new int[8];
        Arrays.fill(keypush,1); //put 1 at every pos
        for(int i=0;i<desc.size();i++){
            push+=desc.get(i)*keypush[i%keypush.length]; //calc push
            if((i+1)%keypush.length==0){ //8,16....
                for(int j=0;j<keypush.length;j++){
                    keypush[j]++; //increment
                }
            }

        }
        return push;

    }
}