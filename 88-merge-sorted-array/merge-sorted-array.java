class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //m gives since where should we start putting nums2
        //len of nums1 is m+n
        //start from m to m+n
        int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k];
            if(k<n){
                k++;
            }else{
                break;
            }
        }
        Arrays.sort(nums1);
       
    }
}