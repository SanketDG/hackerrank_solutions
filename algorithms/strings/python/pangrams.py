s = "".join(input().lower().split())
if (len(set(s))) == 26:
    print("pangram")
else:
    print("not pangram")
