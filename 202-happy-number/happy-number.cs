public class Solution {
    public bool IsHappy(int n) {
        int fast = n;
        int slow =n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int findSquare(int number){
        int sum= 0;
        while(number>0){
            int rem = number %10;
            sum+=rem*rem;
            number = number/10;
        }
        return sum;
    }
}