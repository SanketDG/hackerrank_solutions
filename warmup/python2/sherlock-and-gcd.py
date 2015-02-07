from fractions import gcd
for _ in xrange(int(raw_input())):
    n = int(raw_input())
    gc = 0
    x = [int(num) for num in raw_input().split()]
    for i in xrange(n):
        gc = gcd(gc, x[i])
        print gc
    if gc == 1:
        print "YES"
    else:
        print "NO"
