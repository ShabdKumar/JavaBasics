#include<stdio.h>

void change(int);

int main()
{
    int num = 100;
    printf("\nBefore Call : num = %d",num);
    change(100);
    printf("\nAfter Call : num = %d",num);
    getch();
    return 0;
}

void change(int a)
{
    printf("\nBefore adding in function : num = %d",a);
    a=a+100;
    printf("\nAfter adding in function : num = %d",a);
}
