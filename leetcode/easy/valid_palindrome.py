class Solution:
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1

        while left <= right:
            leftCharacter = s[left].lower()
            rightCharacter = s[right].lower()

            if not leftCharacter.isalnum():
                left += 1
                continue
            if not rightCharacter.isalnum():
                right -= 1
                continue
            if leftCharacter != rightCharacter:
                return False

            left += 1
            right -= 1

        return True
