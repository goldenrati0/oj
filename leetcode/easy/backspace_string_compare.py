class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        s_stack = []
        for c in S:
            if c == "#" and s_stack:
                s_stack.pop()
            elif c != "#":
                s_stack.append(c)

        t_stack = []
        for c in T:
            if c == "#" and t_stack:
                t_stack.pop()
            elif c != "#":
                t_stack.append(c)

        return s_stack == t_stack
