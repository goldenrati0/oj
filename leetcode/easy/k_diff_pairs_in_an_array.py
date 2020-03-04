from typing import List
from collections import Counter


class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        if k < 0:
            return 0

        if k == 0:
            counter = Counter(nums)
            return len([c for c in counter if counter[c] > 1])

        nums_set = set(nums)
        counter = 0
        for num in nums_set:
            if num + k in nums_set:
                counter += 1

        return counter
