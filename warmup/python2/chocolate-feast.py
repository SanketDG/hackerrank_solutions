for i in xrange(int(raw_input())):
    n, c, m = map(int, raw_input().split())
    nc = n / c
    nc1 = nc
    result = 0
    while(nc1 / m > 0):
        result += nc1 / m
        nc1 = (nc1 / m) + (nc1 % m)
    print nc + result
