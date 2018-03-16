#include<stdio.h>
int main()
{
    int array[50];
    int size;
    int * ptr;
    int sum = 0;

    printf("Enter the Size of Array : ");
    scanf("%d",&size);
    printf("Enter %d number to Array : \n",size);
    for(int i=0; i<size; i++)
        scanf("%d",&array[i]);

    ptr = &array;
    for(int i=0; i<size; i++)
        sum = sum + *(ptr+i);

    printf("\nSum of All Elements of Array is : %d",sum);

    getch();
    return 0;
}
