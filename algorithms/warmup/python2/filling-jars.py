n, m = map(int, raw_input().split())
sum = 0
for i in range(m):
    a, b, k = map(int, raw_input().split())
    sum += (b-a+1)*k
print sum / n
