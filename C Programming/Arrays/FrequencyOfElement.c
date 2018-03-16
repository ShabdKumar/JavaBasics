#include<stdio.h>

int main()
{
    int arr[1000],freq[1000];
    int size, count;

    printf("Enter the size of Array :");
    scanf("%d",&size);

    printf("\nEnter the Element in Array :\n");
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

    printf("\nFrequency of All Element in Array :\n");
    for(int i=0; i<size; i++)
    {
        if(freq[i]!=0)
            printf("%d occur %d times.\n",arr[i],freq[i]);
    }
    return 0;

}
