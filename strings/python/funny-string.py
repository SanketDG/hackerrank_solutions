for _ in range(int(input())):
    str = input()
    f = 0
    rev = str[::-1]
    for i in range(1, len(str)-1):
        if abs(ord(str[i]) - ord(str[i-1])) != abs(ord(rev[i]) - ord(rev[i-1])):
            print("Not Funny")
            f = 1
            break
    if not f:
        print("Funny")
