import math


def isperfectsquare(n):
    return True if math.sqrt(n).is_integer() else False

for _ in xrange(int(input())):
    n = int(input())
    fibFormula1 = (5 * (n ** 2)) + 4
    fibFormula2 = (5 * (n ** 2)) - 4
    print "IsFibo" if isperfectsquare(fibFormula1) or isperfectsquare(fibFormula2) else "IsNotFibo"
