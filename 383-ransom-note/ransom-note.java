class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magazineCount = new HashMap<>();
        for(char i : magazine.toCharArray()){
            magazineCount.put(i,magazineCount.getOrDefault(i,0)+1);
        }
        for(char i: ransomNote.toCharArray()){
            if(!magazineCount.containsKey(i) || magazineCount.get(i)==0){
                return false;
            }
            magazineCount.put(i,magazineCount.get(i)-1);
        }
        return true;
    }
}