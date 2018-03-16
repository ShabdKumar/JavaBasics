#include<stdio.h>

int main()
{
    int arr[100], freq[100];
    int count, size;

    printf("\nEnter the size of Array : ");
    scanf("%d",&size);

    printf("\nEnter the Element in Array : \n");
    for(int i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);
        freq[i] = -1;
    }

    for(int i=0; i<size; i++)
    {
        count = 1;
        for(int j=i+1; j<size; j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                freq[j] = 0;
            }
        }
        if(freq[i]!=0)
            freq[i] = count;
    }

    printf("\nUnique Element of Array are : ");
    for(int i=0; i<size; i++)
    {
        if(freq[i]==1)
            printf("%d\t",arr[i]);
    }

    getch();
    return 0;
}
