#include<stdio.h>
int main()
{
    FILE *fp;
    char c;
    char sentence[1000];

    fp = fopen("UserToFile.txt","w");
    printf("Enter a Sentence : \n");
    gets(sentence);
    fprintf(fp, "%s", sentence);
    fclose(fp);

    printf("\n\n");

    fp = fopen("UserToFile.txt","r");
    while((c=fgetc(fp))!=EOF)
    {
        printf("%c",c);
    }
    fclose(fp);

    getch();
    return 0;
}
