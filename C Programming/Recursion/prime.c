#include<stdio.h>

int isPrime(int a, int i)
{
    if(i==1)
        return 1;
    else
    {
        if(a%i==0)
            return 0;
        else
            return isPrime(a,i-1);
    }
}

int main()
{
    int number = 37;
    if(isPrime(number, number/2))
        printf("%d is a Prime Number.",number);
}
