#include<stdio.h>
#define PIE 3.142
int main()
{
    double radius, volume;
    printf("Enter the radius of Sphere : ");
    scanf("%lf",&radius);

    volume = (4.0/3.0)*(PIE*radius*radius*radius);

    printf("Volume of Sphere : %lf",volume);

    getch();
    return 0;
}
