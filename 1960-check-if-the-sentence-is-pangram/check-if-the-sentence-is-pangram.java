class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> new1 = new HashSet<>();
        for (char i : sentence.toCharArray()) {
            if (!new1.contains(i)) {
                new1.add(i);
            }
        }
        return new1.size() == 26;
    }
}
