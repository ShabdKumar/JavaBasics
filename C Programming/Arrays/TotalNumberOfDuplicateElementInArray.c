#include<stdio.h>
int main()
{
    int array[100];
    int frequency[100];
    int size, count;
    int num = 0;

    printf("Enter size of Array : ");
    scanf("%d",&size);
    printf("\nEnter %d Element to Array : \n",size);
    for(int i=0; i<size; i++)
    {
        scanf("%d",&array[i]);
        frequency[i] = -1;
    }

    for(int i=0; i<size; i++)
    {
        count = 1;
        for(int j=i+1; j<size; j++)
        {
            if(array[i]==array[j])
            {
                count++;
                frequency[j] = 0;
            }
        }
        if(frequency[i]!=0)
            frequency[i]=count;
    }
    for(int i=0; i<size; i++)
        if((frequency[i]!=0)&&(frequency[i]!=1))
            num++;

    printf("\nTotal no of Duplicate Elements in Array is : %d",num);
    getch();
    return 0;
}
