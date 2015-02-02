from math import sqrt, floor, ceil

for _ in xrange(int(raw_input())):
    a, b = map(int, raw_input().split())
    print int(floor(sqrt(b)) - ceil(sqrt(a)) + 1)
