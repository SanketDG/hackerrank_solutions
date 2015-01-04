#!/bin/python

# Complete the function below.


def maxXor(l,  r):
    xorList = []
    for i in range(l, r + 1):
        for j in range(l, r + 1):
            xorList.append(i ^ j)
    return max(xorList)

_l = int(raw_input())


_r = int(raw_input())

res = maxXor(_l, _r)
print(res)
