from typing import List


class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        last_indexes = {}
        result = []

        for index, item in enumerate(S):
            if item in last_indexes:
                if index > last_indexes[item]:
                    last_indexes[item] = index
            else:
                last_indexes[item] = index

        left = 0
        right = last_indexes[S[left]]

        while left <= right:
            if left == right:
                left += 1
                result.append(left - sum(result))
                if left != len(S):
                    right = last_indexes[S[left]]
                else:
                    break
            else:
                if last_indexes[S[left]] > right:
                    right = last_indexes[S[left]]
                left += 1

        return result
