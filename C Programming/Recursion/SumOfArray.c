#include<stdio.h>

int sumOfArray(int[],int);
int main()
{
    int array[100];
    int len;
    printf("Enter the Size of Array :");
    scanf("%d",&len);
    printf("\nEnter the element :\n");
    for(int i=0; i<len; i++)
        scanf("%d",&array[i]);
    printf("\nSum of Array = %d",sumOfArray(array,len));
    getch();
    return 0;
}
int sumOfArray(int arr[],int i)
{
    if(i<0)
        return 0;
    else
        return (arr[i-1] + sumOfArray(arr,i-1));
}
