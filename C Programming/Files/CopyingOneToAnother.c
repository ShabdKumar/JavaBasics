#include<stdio.h>
#include<stdlib.h>

int main()
{
    char c;
    FILE *fp1;
    FILE *fp2;
    fp1 = fopen("write.txt","r");
    fp2 = fopen("copying.txt","w");
    while(c=getc(fp1)!=EOF)
    {
        putc(c,fp2);
    }
    fclose(fp1);
    fclose(fp2);
    return 0;
}
