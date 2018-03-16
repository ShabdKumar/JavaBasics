#include<stdio.h>
#include<string.h>

int length(char array[])
{
    int j=0;
    for(int i=0; array[i]!='\0';i++)
    {
        j++;
    }
    return j;
}

int main()
{
    char *array1 = "Hello World";
    char *array2 = "Hello Bangalore";

    int sizeArray1 = length(array1);
    int sizeArray2 = length(array2);

    printf("%d, %d",sizeArray1, sizeArray2);

    int res = sizeArray1 - sizeArray2;
    if(res>0)
    {
        printf("\nArray1 is larger and by %d.",(sizeArray1-sizeArray2));
    }
    else if(res<0)
    {
        printf("\nArray2 is larger and by %d.",(sizeArray2-sizeArray1));
    }
    else
    {
        printf("\nBoth Array are equal in Length.");
    }

    getch();
    return 0;
}
