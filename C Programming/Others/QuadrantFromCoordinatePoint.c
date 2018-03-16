#include<stdio.h>
int main()
{
    int x, y;
    printf("Enter two Coordinate Points : \n");
    scanf("%d%d", &x, &y);

    if((x>0)&&(y>0))
        printf("\nThe coordinate %d %d lies in First Quadrant.", x, y);
    else if((x<0)&&(y>0))
        printf("\nThe coordinate %d %d lies in Second Quadrant.", x, y);
    else if((x<0)&&(y<0))
        printf("\nThe coordinate %d %d lies in Third Quadrant.", x, y);
    else if((x>0)&&(y<0))
        printf("\nThe coordinate %d %d lies in Fourth Quadrant.", x, y);
    else
        printf("\nThe coordinate %d %d lies at Origin.", x, y);

    getch();
    return 0;
}
