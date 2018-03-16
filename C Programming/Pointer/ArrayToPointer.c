#include<stdio.h>

int main()
{
    int balance[5] = {100,20,30,120,5};
    int *p;
    p = balance;

    printf("Arrays value using pointer :\n");
    for(int i=0; i<5; i++) {
        printf("%d\t",*(p+i));
    }

    printf("\n\nArrays value using balance as address:\n");
    for(int i=0; i<5; i++) {
        printf("%d\t",*(balance+i));
    }
    return 0;
}
