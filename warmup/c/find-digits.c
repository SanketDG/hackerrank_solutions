#include <stdio.h>

int main(){
    int T;
    int n;
    int c;
    int num;
    int rem;

    scanf("%d", &T);
    for(int i=0;i<T;i++){
        scanf("%d", &n);
        c = 0;
        num = n;

        while (n>0){
            rem = n % 10;
            if (rem !=0 && num%rem == 0){
                c++;
            }
            n /= 10;
        }
        printf("%d\n", c);
    }
    return 0;
}