for _ in xrange(int(raw_input())):
    n, k = map(int, raw_input().split())
    s = list(raw_input().split())
    c = 0
    for i in s:
        if int(i) <= 0:
            c += 1
    if c < k:
        print "YES"
    else:
        print "NO"
