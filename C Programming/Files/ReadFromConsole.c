#include<stdio.h>

int main()
{
    char c;
    FILE *fp;
    char a[100];
    printf("Enter the file name or Full location :\n");
    gets(a);

    fp = fopen(a,"r");
    printf("\n");
    while(c=fgetc(fp)!=EOF)
    {
        printf("%c",c);
    }
    fclose(fp);

    return 0;
}
