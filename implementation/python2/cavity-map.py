n = int(raw_input())
x = []
res = []
for i in range(n):
    x.append(raw_input())
res.append(x[0])
for i in range(1, len(x) - 1):
    res.append(x[i][0])
    for a in range(1, len(x[i]) - 1):
        mid = int(x[i][a])
        top = int(x[i - 1][a])
        right = int(x[i][a + 1])
        bottom = int(x[i+1][a])
        left = int(x[i][a - 1])
        if mid > top and mid > right and mid > bottom and mid > left:
            res[i] += "X"
        else:
            res[i] += x[i][a]
    res[i] += x[i][-1]
if n != 1:
    res.append(x[-1])
for i in range(len(res)):
    print res[i]
