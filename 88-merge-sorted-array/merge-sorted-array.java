class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //m gives since where should we start putting nums2
        //len of nums1 is m+n
        //start from m to m+n
        int k=m+n-1; //last
        int i=m-1,j= n-1; //nums2
        while (j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
       
    }
}