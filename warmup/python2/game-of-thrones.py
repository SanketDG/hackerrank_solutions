from collections import Counter


def isPalin(string):
    letter_counts = Counter(string).values()
    odd_counts = [count for count in letter_counts if count % 2]
    print odd_counts
    return len(odd_counts) <= 1

string = raw_input()
print 'YES' if isPalin(string) else 'NO'
