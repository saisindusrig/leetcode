class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] w1 = s1.split("\\s+"); // seperate by space
        String[] w2 = s2.split("\\s+");
        Map<String, Integer> hm = new HashMap<>();
        for (String i : w1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (String i : w2) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<String> nl = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                nl.add(entry.getKey());
            }
        }
        String[] res = new String[nl.size()];
        nl.toArray(res); // to string arr
        return res;

    }
}