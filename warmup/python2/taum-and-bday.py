for _ in xrange(int(raw_input())):
    b, w = map(int, raw_input().split())
    x, y, z = map(int, raw_input().split())

    if x == y or max(x, y, z) == z:
        print x * b + w * y
    elif x > y:
        mul = x if x < (y + z) else y + z
        print y * w + b * mul
    else:
        mul = y if y < (x + z) else x + z
        print x * b + w * mul
