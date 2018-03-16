#include<stdio.h>

int main()
{
    int num;
    printf("Enter the Number :");
    scanf("%d",&num);

    switch (num%2)
    {
        case 0 : printf("\n%d is a Even Number.\n\n",num);
                break;
        case 1 : printf("\n%d is a Odd Number.\n\n",num);
                break;
        default : printf("\n%d is a Not a Number.\n\n",num);
    }
    return 0;
}
