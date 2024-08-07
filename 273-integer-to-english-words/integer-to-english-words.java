class Solution {
    public String numberToWords(int num) {
        Map<Integer, String> dic = new HashMap<>();
        dic.put(0, "Zero");
        dic.put(1, "One");
        dic.put(2, "Two");
        dic.put(3, "Three");
        dic.put(4, "Four");
        dic.put(5, "Five");
        dic.put(6, "Six");
        dic.put(7, "Seven");
        dic.put(8, "Eight");
        dic.put(9, "Nine");
        dic.put(10, "Ten");
        dic.put(11, "Eleven");
        dic.put(12, "Twelve");
        dic.put(13, "Thirteen");
        dic.put(14, "Fourteen");
        dic.put(15, "Fifteen");
        dic.put(16, "Sixteen");
        dic.put(17, "Seventeen");
        dic.put(18, "Eighteen");
        dic.put(19, "Nineteen");
        dic.put(20, "Twenty");
        dic.put(30, "Thirty");
        dic.put(40, "Forty");
        dic.put(50, "Fifty");
        dic.put(60, "Sixty");
        dic.put(70, "Seventy");
        dic.put(80, "Eighty");
        dic.put(90, "Ninety");
        dic.put(100, "Hundred");
        dic.put(1000, "Thousand");
        dic.put(1000000, "Million");
        dic.put(1000000000, "Billion");

        if (num == 0) {
            return "Zero";
        }
        return find(num, dic);
    }

    private String find(int num, Map<Integer, String> dic) {
        if (num < 10) {
            return dic.get(num);
        } else if (num < 20) {
            return dic.get(num);
        } else if (num < 100) { //less than 100
            int tens = num / 10 * 10;  // 34
            int remainder = num - tens; //0
            return dic.get(tens) + (remainder > 0 ? " " + find(remainder, dic) : "");
        } else if (num < 1000) {
            int hundreds = num / 100;
            int remainder = num - hundreds * 100;
            return dic.get(hundreds) + " Hundred" + (remainder > 0 ? " " + find(remainder, dic) : "");
        } else if (num < 1000000) {
            int thousands = num / 1000;
            int remainder = num - thousands * 1000;
            return find(thousands, dic) + " Thousand" + (remainder > 0 ? " " + find(remainder, dic) : "");
        } else if (num < 1000000000) {
            int millions = num / 1000000;
            int remainder = num - millions * 1000000;
            return find(millions, dic) + " Million" + (remainder > 0 ? " " + find(remainder, dic) : "");
        } else {
            int billions = num / 1000000000;
            int remainder = num - billions * 1000000000;
            return find(billions, dic) + " Billion" + (remainder > 0 ? " " + find(remainder, dic) : "");
        }
    }
}