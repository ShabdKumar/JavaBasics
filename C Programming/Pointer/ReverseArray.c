#include<stdio.h>

void swap(int *num1, int *num2)
{
    int temp = *num2;
    *num2 = *num1;
    *num1 = temp;
}

int main()
{
    int A[5] = {1,2,3,4,5};
    printf("Actual Array is :\n");
    for(int i=0; i<5; i++) {
        printf("%d\t",*(A+i));
    }

    int *pointer1;
    pointer1 = A;
    int *pointer2;
    pointer2 = A + 5 - 1;

    while(pointer1<pointer2) {
        swap(pointer1, pointer2);
        pointer1++;
        pointer2--;
    }
    for(int i=0; i<5; i++) {
        printf("%d\t",*(A+i));
    }
}
