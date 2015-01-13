#include <stdio.h>

int main(){
    int T;
    int n;

    scanf("%d", &T);

    while(T--){
        scanf("%d", &n);

        printf("%d\n", (n*n)/4);
    }
}