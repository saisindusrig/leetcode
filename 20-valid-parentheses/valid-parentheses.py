class Solution:
    def isValid(self, s: str) -> bool:
        a=[]
        for i in s:
            if i=="(" or i=="{" or i=="[":
                a.append(i) 
            else:
                if len(a)==0:
                    return False
                if i==")" and a[-1]=="(":
                    a.pop()
                elif i=="}" and a[-1]=="{":
                    a.pop()
                elif i=="]" and a[-1]=="[":
                    a.pop()
                else:
                    return False
        if len(a)==0:
            return True
        return False