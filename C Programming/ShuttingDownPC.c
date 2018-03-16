#include<stdio.h>
#include<stdlib.h>
int main()
{
    char ch;
    printf("\nFor shutdown Type s.\nFor restart Type r.\n\n");
    scanf("%c",&ch);

    if(ch=='s' || ch=='S')
        system("C:\\WINDOWS\\System32\\shutdown -s -t 30");
    else if(ch=='r' || ch=='R')
        system("C:\\WINDOWS\\System32\\shutdown -r -t 25");
    return 0;
}
