#include<stdio.h>

int main()
{
    int row,col;
    int array[10][10];
    printf("\nEnter the no. of Row :");
    scanf("%d",&row);
    printf("\nEnter the no. of Column :");
    scanf("%d",&col);
    printf("\nEnter %d Element :\n",row*col);
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            scanf("%d",&array[i][j]);
        }
    }

    printf("\nThe %d*%d Matrix is :\n",row,col);
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            printf("%d\t",array[i][j]);
        }
        printf("\n");
    }
    getch();
    return 0;
}
