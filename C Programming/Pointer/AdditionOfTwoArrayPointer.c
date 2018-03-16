#include<stdio.h>

int main()
{
    int A[5] = {0,1,2,3,4};
    int B[5] = {9,8,7,6,5};
    int C[5];
    for(int i=0; i<5; i++){
        *(C+i) = *(A+i) + *(B+i);
        printf("%d\t",*(C+i));
    }
    return 0;
}
