#include<stdio.h>
int main()
{
    FILE *fp, *fp1;
    int a, b;
    int sum = 0;

    fp = fopen("input.txt","r");
    fp1 = fopen("output.txt","w");

    fscanf(fp,"%d%d", &a, &b);
    sum = a + b;
    fprintf(fp1,"%d",sum);
    fclose(fp);
    fclose(fp1);

    getch();
    return 0;
}
