class Solution {
    public String defangIPaddr(String address) {
        String replace =address.replace(".","[.]");
        return replace;
    }
}