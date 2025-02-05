"""
2390. Removing Stars From a String
https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75
Medium
"""
class Solution:
    def removeStars(self, s: str) -> str:
        stk = []

        for i in s:
            if i != '*':
                stk.append(i)
            else:
                stk.pop()
                continue
        
        return ''.join(stk)
