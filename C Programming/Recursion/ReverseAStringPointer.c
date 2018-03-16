#include<stdio.h>

void reverseString(char *, int, int);

int main()
{
    char str[] = "shabdkumar";
    int length = strlen(str);
    reverseString(str,0,length-1);
    printf("%s",str);
    getch();
    return 0;
}

void reverseString(char *string, int front, int end)
{
    if(front<=end)
    {
        char temp;
        temp = string[front];
        string[front] = string[end];
        string[end] = temp;
        front++;
        end--;
        reverseString(string,front,end);
    }
}
