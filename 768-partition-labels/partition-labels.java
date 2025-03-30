class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hp.put(s.charAt(i),i);
        }
        List<Integer> l = new ArrayList<>();
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            //first find how far can i go(using map val)
            y= Math.max(y,hp.get(s.charAt(i)));

            if(i==y){
                l.add(y-x+1);
                x=y+1;
            }
        }
        return l;
    }
}