class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        if(nums.size()==1) return -1;
        
        int dom = majority(nums);
       
       int td=0;
       for(int n:nums){
        if(n==dom){
            td++;
        }
       }
       int l=0;
       for(int i=0;i<nums.size();i++){
        if(nums.get(i)==dom){
            l++;
        }
        int r = td-l;
        int ls = i+1;
        int rs = nums.size()-ls;

        if(2*l>ls && 2*r>rs){
            return i;
        }
       }
        
        return -1;
    
    }
   
    public int majority(List<Integer> a){
        int v=0,c=-1;
        for(int i=0;i<a.size();i++){
            if(v==0){
                c= a.get(i);
                v=1;
            }
            else{
                if(a.get(i)==c){
                    v++;
                }else{
                    v--;
                }
            }
        }
     
        v=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==c){
                v++;
            }
        }
        
        return (v > a.size() / 2) ? c : -1;
    }
}
