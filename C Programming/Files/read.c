#include<stdio.h>

int main()
{
    char c;
    FILE *fp;
    fp = fopen("shabd.txt","r");

    while(c=fgetc(fp)!=EOF)
    {
        printf("%C",c);
    }
    fclose(fp);

    return 0;
}
