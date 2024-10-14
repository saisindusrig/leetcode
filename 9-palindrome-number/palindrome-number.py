class Solution:
    def isPalindrome(self, x: int) -> bool:
        n=x
        s=0
        while n>0:
            s*=10 
            s+=(n%10) 
            n//=10 
        if x==s:
            return True
        else:
            return False