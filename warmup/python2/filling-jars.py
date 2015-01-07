n, m = map(int, raw_input().split())
jars = [0] * n
sum = 0
for i in range(m):
    a, b, k = map(int, raw_input().split())
    for j in range(a, b + 1):
        sum += (b-a+1)*k
print sum(jars) / n
