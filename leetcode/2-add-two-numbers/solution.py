# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        first_reversed_number = ""
        first_node = l1
        while first_node is not None:
            first_reversed_number += str(first_node.val)
            first_node = first_node.next

        second_reversed_number = ""
        first_node = l2
        while first_node is not None:
            second_reversed_number += str(first_node.val)
            first_node = first_node.next

        v = str(int(first_reversed_number[::-1]) + int(second_reversed_number[::-1]))[::-1]
        l3 = ListNode(v[0])
        first_node = l3
        for ch in v[1:]:
            first_node.next = ListNode(ch)
            first_node = first_node.next

        return l3