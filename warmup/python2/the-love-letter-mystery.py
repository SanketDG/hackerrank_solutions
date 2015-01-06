for _ in xrange(int(raw_input())):
    s = raw_input()
    c = 0
    for i in range(len(s) / 2):
        if s[i] != s[-i - 1]:
            fasc, lasc = ord(s[i]), ord(s[-i - 1])
            c += fasc - lasc if fasc > lasc else lasc - fasc
    print c
