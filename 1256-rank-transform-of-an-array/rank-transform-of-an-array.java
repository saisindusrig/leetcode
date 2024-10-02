class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] c = arr.clone();
        Arrays.sort(c);
        Map<Integer, Integer> h = new HashMap<>();
        int r = 1; // rank starts from 1
        for (int i = 0; i < c.length; i++) {
            if (!h.containsKey(c[i])) {
                h.put(c[i], r);
                r++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = h.get(arr[i]);
        }
        return arr;
    }
}