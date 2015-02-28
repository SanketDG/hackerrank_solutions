#include <stdio.h>
/*
 * Complete the function below.
 */
int maxXor(int l, int r) {
    int maxVal = -1;
    int val;

    for(int i=l;i<=r;i++) {
        for(int j=l;j<=r;j++) {
            val = i ^ j;

            if (val > maxVal)
                maxVal = val;
        }
    }
    return maxVal;
}
int main() {
    int res;
    int _l;
    scanf("%d", &_l);

    int _r;
    scanf("%d", &_r);

    res = maxXor(_l, _r);
    printf("%d", res);

    return 0;
}
