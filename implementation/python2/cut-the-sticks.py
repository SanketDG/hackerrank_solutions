c = 0
length = int(raw_input())
num = map(int, raw_input().split())
n = []
num.sort()
for i in range(length):
    if num[i] == 0:
        continue
    else:
        n.append(length - i)
        v = num[i]
        for j in range(length):
            num[j] -= v
print "\n".join(map(str, n))
