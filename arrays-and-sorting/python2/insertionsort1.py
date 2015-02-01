n = int(raw_input())
ar = [int(x) for x in raw_input().split()]
l = ar[n - 1]
for i in range(n - 1, 0, -1):
    if ar[i - 1] > l:
        ar[i] = ar[i - 1]
        print " ".join(map(str, ar))
        print i
    else:
        ar[i] = l
        print " ".join(map(str, ar))
        break
ar[0] = l
print " ".join(map(str, ar))
