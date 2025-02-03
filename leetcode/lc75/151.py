"""
151. Reverse Words in a String
https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75
Medium
"""
class Solution:
    def reverseWords(self, s: str) -> str:       
        return " ".join(s.split()[::-1])
