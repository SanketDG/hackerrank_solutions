def getPivot(n):
    while(n > 0):
        if not n % 3:
            break
        else:
            n -= 5

    return n

for _ in xrange(int(raw_input())):
    n = int(raw_input())
    pivot = getPivot(n)
    if pivot < 0:
        print "-1"
        continue
    print "5" * pivot + "3" * (n - pivot)
