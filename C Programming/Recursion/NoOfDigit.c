#include<stdio.h>
static int i=0;
void digit(int num)
{
    if(num>0)
    {
        i++;
        digit(num/10);
    }
}

int main()
{
    int num = 123456;
    digit(num);
    printf("%d",i);
}
