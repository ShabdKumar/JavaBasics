#include<stdio.h>
int main()
{
    int totalDays;
    int years, weeks, days;

    printf("Enter total no. of Days : ");
    scanf("%d",&totalDays);

    years = (totalDays/365);
    weeks = (totalDays%365)/7;
    days = (totalDays%365)%7;

    printf("\nYears : %d",years);
    printf("\nWeeks : %d",weeks);
    printf("\nDays : %d",days);

    getch();
    return 0;
}
