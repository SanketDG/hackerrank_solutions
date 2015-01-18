#include <stdio.h>

int main()
{
    int T;
    int n, c, m, nc, nc1;
    int result;

    scanf("%d", &T);

    while (T--) {
        scanf("%d %d %d", &n, &c, &m);

        nc = n / c;
        nc1 = nc;

        result = 0;

        while (nc1 / m > 0) {
            result += ( nc1 / m );
            nc1 = (nc1 / m) + (nc1 % m);
        }
        printf("%d\n", (nc + result));

    }

    return 0;
}