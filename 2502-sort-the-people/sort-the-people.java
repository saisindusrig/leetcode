class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> namesHeight = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            namesHeight.put(heights[i],names[i]);
        }
        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        String[] newArr = new String[names.length];
        int i=0;
        for(int s: heights){
            String m = namesHeight.get(s);
            newArr[i] = m;
            i++;

        }
        return newArr;
    }
}