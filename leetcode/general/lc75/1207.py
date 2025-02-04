"""
1207. Unique Number of Occurrences
https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75
Easy
"""
from typing import List

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        # Not using Python Builtins
        freq = {}
        for x in arr:
            freq[x] = freq.get(x, 0) + 1
        
        return len(freq) == len(set(freq.values()))