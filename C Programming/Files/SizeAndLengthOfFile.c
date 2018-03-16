#include<stdio.h>

int main()
{
    char c;
    FILE *fp;
    char a[50];
    int size;
    int len = 0;

    fp = fopen("shabd.txt","r");
    printf("\n");
    while(c=fgetc(fp)!=EOF)
    {
        len++;
    }

    fseek(fp,0,2);
    size = ftell(fp);

    printf("\nSize = %d, and length = %d",size,len);
    fclose(fp);
    getch();
    return 0;
}
