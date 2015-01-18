for _ in xrange(int(raw_input())):
    n = int(raw_input()) - 1
    a1 = int(raw_input())
    b1 = int(raw_input())
    a, b = min(a1, b1), max(a1, b1)
    current = a * n
    maximum = b * n
    diff = b - a
    if a == b:
        print current
    else:
        x = []
        while(current <= maximum):
            x.append(current)
            current += diff
        print " ".join(map(str, x))
