n = int(raw_input())
a = [int(x) for x in raw_input().split()]
for i in a:
    if a.count(i) == 1:
        print i
