for _ in xrange(int(raw_input())):
    s = raw_input()
    b = '{0:032b}'.format(int(s.zfill(32)))
    binaryString = ''.join("1" if i == "0" else "0" for i in b)
    print int(binaryString, 2)
