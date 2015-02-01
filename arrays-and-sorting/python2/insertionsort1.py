n = int(raw_input())
ar = [int(x) for x in raw_input().split()]
l = ar[n - 1]
j = 0
for i in range(n - 1, 0, -1):
    if ar[i - 1] > l:
        ar[i] = ar[i - 1]
        print " ".join(map(str, ar))
    else:
        ar[i] = l
        j = 1
        break
if not j:
    ar[0] = l
print " ".join(map(str, ar))
