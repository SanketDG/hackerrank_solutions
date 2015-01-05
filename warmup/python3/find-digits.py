T = input()
for _ in range(T):
    n = input()
    digits = list(map(int, str(n)))

    print (sum(digits.count(k)
               for k in range(1, 10) if k in digits and n % k == 0))
