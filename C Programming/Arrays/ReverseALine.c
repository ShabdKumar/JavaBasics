#include<stdio.h>
#include<string.h>

int main()
{
    char line[50], reverse[50];
    printf("Enter a Line : ");
    gets(line);
    int j=0;

    for(int i=0; line[i]!='\0';i++)
    {
        j++;
    }

    int k = j;
    for(int i=0; i<=k; i++)
    {
        reverse[i] = line[j];
        j--;
        printf("%c",reverse[i]);
    }

    return 0;
}
