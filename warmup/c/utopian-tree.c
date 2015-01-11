#include <stdio.h>

int main() {
    int n;
    int height;
    int T;

    scanf("%d", &T);

    for (int i=0;i<T;i++)
    {
        scanf("%d\n", &n);
        height = 1;
        for (int i = 1;i<=n;i++)
        {
            if (i % 2 != 0) {
                height *= 2;
            }
            else {
                height +=1;
            }
        }
        printf("%d\n", height);
    }
}