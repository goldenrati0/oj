#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the timeInWords function below.


def int_to_en(num):
    d = {0: 'zero', 1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five',
         6: 'six', 7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten',
         11: 'eleven', 12: 'twelve', 13: 'thirteen', 14: 'fourteen',
         15: 'fifteen', 16: 'sixteen', 17: 'seventeen', 18: 'eighteen',
         19: 'nineteen', 20: 'twenty',
         30: 'thirty'}

    assert (0 <= num)

    if num < 20:
        return d[num]

    if num < 100:
        if num % 10 == 0:
            return d[num]
        else:
            return d[num // 10 * 10] + ' ' + d[num % 10]


def timeInWords(h, m):
    hours = {
        1: "one",
        2: "two",
        3: "three",
        4: "four",
        5: "five",
        6: "six",
        7: "seven",
        8: "eight",
        9: "nine",
        10: "ten",
        11: "eleven",
        12: "twelve",
        13: "one"
    }

    if m == 0:
        return hours[h] + " o' clock"
    elif m == 1:
        return str(int_to_en(m)) + " minute past " + hours[h]
    elif 2 <= m < 15:
        return str(int_to_en(m)) + " minutes past " + hours[h]
    elif m == 15:
        return "quarter past " + hours[h]
    elif 16 <= m < 30:
        return str(int_to_en(m)) + " minutes past " + hours[h]
    elif m == 30:
        return "half past " + hours[h]
    elif 30 < m < 45 or 45 < m < 60:
        return str(int_to_en(60 - m)) + " minutes to " + hours[h + 1]
    elif m == 45:
        return "quarter to " + hours[h + 1]


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    h = int(input())

    m = int(input())

    result = timeInWords(h, m)

    fptr.write(result + '\n')

    fptr.close()
