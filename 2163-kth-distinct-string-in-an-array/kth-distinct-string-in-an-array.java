class Solution {
    public String kthDistinct(String[] arr, int k) {
       Map<String,Integer> countDistinct = new HashMap<>();
       for(String i: arr){
        countDistinct.put(i,countDistinct.getOrDefault(i,0)+1);
       } 
       List<String> r=new ArrayList<>();
       for(String i: arr){
        if(countDistinct.get(i)==1){
            if(!r.contains(i)){
                r.add(i);
            }
        }
       }
       if(k <= r.size()) {
           return r.get(k-1);
       } else {
           return "";
       }
       
    }
}