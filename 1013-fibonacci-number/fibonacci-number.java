class Solution {
    public int fib(int n) {
        //0,1,1,2,3,5,8
        if(n<2) return n;
        return fib(n-1)+fib(n-2);
    }
}