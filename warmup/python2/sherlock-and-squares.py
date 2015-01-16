from math import sqrt, floor, ceil


def isperfectsquare(n):
    return True if sqrt(n).is_integer() else False

for _ in xrange(int(raw_input())):
    a, b = map(int, raw_input().split())
    c = 0
    print int(floor(sqrt(b)) - ceil(sqrt(a)) + 1)
