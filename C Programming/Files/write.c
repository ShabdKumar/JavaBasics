#include<stdio.h>
#include<stdlib.h>
int main()
{
    FILE *fp;
    char sentence[1000];

    fp = fopen("write.txt","w");

    printf("Enter a Sentence :");
    gets(sentence);

    fprintf(fp, "%s", sentence);
    fclose(fp);

    return 0;
}
