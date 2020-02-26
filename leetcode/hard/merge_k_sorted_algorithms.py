# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Heap:
    numbers: List[int]
    size: int

    def __init__(self):
        self.numbers = [0]
        self.size = 0

    def build_heap(self, numbers: List[int]):
        length = len(numbers)
        index = length // 2
        self.size += length
        self.numbers = [0] + numbers.copy()
        while index > 0:
            self.balance_heap(index)
            index -= 1

    def smaller_child(self, index: int) -> int:
        if (2 * index) + 1 > self.size:
            return 2 * index
        return 2 * index \
            if self.numbers[2 * index] < self.numbers[(2 * index) + 1] \
            else (2 * index) + 1

    def balance_heap(self, index: int):
        while index * 2 <= self.size:
            smaller_child_index = self.smaller_child(index)
            if self.numbers[smaller_child_index] < self.numbers[index]:
                self.numbers[index], self.numbers[smaller_child_index] = \
                    self.numbers[smaller_child_index], self.numbers[index]
            index = smaller_child_index

    def min_heapify(self, index: int):
        parent = index // 2
        while parent > 0:
            if self.numbers[parent] < self.numbers[index]:
                self.numbers[parent], self.numbers[index] = self.numbers[index], self.numbers[parent]
            parent //= 2

    def insert(self, item: int):
        self.numbers.append(item)
        self.size += 1
        self.min_heapify(self.size)

    def pop_top(self) -> int:
        if self.size == 0:
            return None

        val = self.numbers[1]
        self.numbers[1] = self.numbers[self.size]
        self.size -= 1
        self.numbers.pop()
        self.balance_heap(1)
        return val


class Solution:
    def mergeKLists(self, lists: List[ListNode]) -> ListNode:
        if len(lists) == 0:
            return None
        
        numbers = self.get_numbers(lists)
        minHeap = Heap()
        minHeap.build_heap(numbers)
        head = ListNode(minHeap.pop_top())
        if head.val is None:
            return None

        current = head
        while minHeap.size != 0:
            current.next = ListNode(minHeap.pop_top())
            current = current.next
        return head

    def get_numbers(self, lists: List[ListNode]) -> List[int]:
        numbers = list()
        for l in lists:
            current = l
            while current:
                numbers.append(current.val)
                current = current.next
        return numbers