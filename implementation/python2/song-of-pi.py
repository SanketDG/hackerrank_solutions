for _ in range(int(input())):
    s = input()
    o = '31415926535897932384626433833'
    x = "".join(map(str, map(len, s.split())))
    if x == o[:len(x)]:
        print("It's a pi song.")
    else:
        print("It's not a pi song.")
