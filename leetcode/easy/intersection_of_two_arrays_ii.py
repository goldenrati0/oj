from collections import Counter
from typing import List


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1_counter, nums2_counter = Counter(nums1), Counter(nums2)

        if len(nums1_counter) > len(nums2_counter):
            bigger, smaller = nums1_counter, nums2_counter
        else:
            bigger, smaller = nums2_counter, nums1_counter

        result = []
        for key in smaller:
            if key in bigger:
                if nums1_counter[key] < nums2_counter[key]:
                    temp_counter = nums1_counter
                else:
                    temp_counter = nums2_counter
                result += [key for _ in range(temp_counter[key])]

        return result
