for _ in xrange(int(raw_input())):
    a = raw_input()
    c = 0
    for i in range(len(a)-1):
        if a[i] == a[i + 1]:
            c += 1
    print c
