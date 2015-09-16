#include <stdio.h>

int gcd(int a, int b)
{
    int tmp;
    while(b>0){
        tmp = b;
        b = a % b;
        a = tmp;
    }
    return a;
}

int main(void)
{
    int n, i, T, k;

    scanf("%d", &T);

    while(T--){
        int gc;
        scanf("%d", &n);

        gc = 0;

        for (i=0;i<n;i++)
        {
            scanf("%d", &k);
            gc = gcd(gc, k);
        }
        if (gc == 1)
            printf("YES\n");
        else
            printf("NO\n");

    }
}