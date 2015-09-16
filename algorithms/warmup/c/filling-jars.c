#include <stdio.h>
#include <math.h>

int main(void)
{
    long n, m, sum;
    long a, b, k;
    int i;

    scanf("%ld %ld", &n, &m);

    sum = 0;

    for (i=0; i<m; i++)
    {
        scanf("%ld %ld %ld", &a, &b, &k);

        sum += (b-a+1)*k;
    }

    printf("%ld", (sum/n));
}