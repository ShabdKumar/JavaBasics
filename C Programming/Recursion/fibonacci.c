#include<stdio.h>

void fibonacci (int a, int b, int c)
{
    if(c!=0)
    {
        int d = a+b;
        printf("%d\t",d);
        fibonacci(b,d,c-1);
    }
}

int main()
{
    int a=0, b=1;
    int term;
    printf("Enter the number of term you want to print :");
    scanf("%d",&term);
    printf("\n%d\t%d\t",a,b);
    fibonacci(a,b,term-2);
    return 0;
}
