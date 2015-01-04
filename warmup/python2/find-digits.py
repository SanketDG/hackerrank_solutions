T = int(raw_input())
for _ in xrange(T):
    n = int(raw_input())
    digits = list(map(int, str(n)))

    print sum(digits.count(k) for k in xrange(1, 10) if k in digits and n % k == 0)
