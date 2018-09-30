"""
https://www.hackerrank.com/challenges/non-divisible-subset/forum/comments/150647
---------------------------------------------------------------------------------
This initially appears difficult to solve in reasonable time complexity. After further thought, I think this can be done on O(n) with a few considerations. This is supposed to be an "easy" problem, so I'll provide some algorithm guidance here.

For any number K, the sum of 2 values (A & B) is evenly divisible by K if the sum of the remainders of A/K + B/K is K. (There is also a special case where both A & B are evenly divisible, giving a sum of 0.)

For any such remainder, there is 1 and only 1 other remainder value which will make a sum divisible by K.

Example: with K of 5, remainder pairs are 1+4 & 2+3. Given the numbers with a remainder of 1, they can't be paired with ANY of the numbers with remainder 4 (and vice versa). So, for the number of values in the resultant set, choose the larger of values with remainder 1 vs. values with remainder 4. Choose the larger set of remainder 2 vs remainder 3.

For the special case where remainder is 0, given the set of all values which are individually divisible by K, they can't be paired with any others. So, at most 1 value which is evenly divisible by K can be added to the result set.

For even values of K, the equal remainder is simular to the 0 case. For K = 6, pairs are 1+5, 2+4, 3+3. For values with remainder 3, at most one value can be added to the result set.

"""
# !/bin/python3

import math
import os
import random
import re
import sys


# Complete the nonDivisibleSubset function below.
def nonDivisibleSubset(k, S):
    ks_remainders = {i: [] for i in range(k)}
    for num in S:
        ks_remainders[num % k].append(num % k)

    counter = 0

    if len(ks_remainders[0]) > 0:
        counter += 1

    remainders_tuple = set([(i, k - i) for i in range(1, (k // 2) + 1)])
    # print(remainders_tuple)

    for m, n in remainders_tuple:
        if m == n and len(ks_remainders[m]) > 0:
            counter += 1
            continue

        if len(ks_remainders[m]) > len(ks_remainders[n]):
            counter += len(ks_remainders[m])
        else:
            counter += len(ks_remainders[n])
    # print(ks_remainders)
    return counter


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    S = list(map(int, input().rstrip().split()))

    result = nonDivisibleSubset(k, S)

    fptr.write(str(result) + '\n')

    fptr.close()
