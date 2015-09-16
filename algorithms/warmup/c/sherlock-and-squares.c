#include <stdio.h>
#include <math.h>

int main()
{
    int a, b;
    int T;

    scanf("%d", &T);

    while(T--){
    scanf("%d %d", &a, &b);
    printf("%d\n", (int)(floor(sqrt(b)) - ceil(sqrt(a)) + 1));
    }

    return 0;
}