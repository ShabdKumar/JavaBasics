#include<stdio.h>
#include<string.h>

int main()
{
    char word[50];
    printf("Enter a Word : ");
    gets(word);
    int j=0;

    for(int i=0; word[i]!='\o';i++)
    {
        j++;
    }

    for(int i=j; i>=0; i--)
    {
        printf("%c",word[i]);
    }
    return 0;
}
