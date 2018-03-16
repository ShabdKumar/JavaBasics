#include<stdio.h>
int main()
{
    char ch;
    printf("Enter the character : ");
    scanf("%c",&ch);

    if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        printf("\n%c is an Alphabet.",ch);
    else if(ch>='0'&&ch<='9')
        printf("\n%c is a Digit.",ch);
    else
        printf("\n%c is a Special Character",ch);

    getch();
    return 0;
}
