#include<stdio.h>
struct sEmployee
{
    char name[20];
    long salary;
    int emp_id;
};
union uEmployee
{
    char name[20];
    long salary;
    int emp_id;
};

int main()
{
    struct sEmployee sE;
    union uEmployee uE;
    printf("Size of Structure : %d\n",sizeof(sE));
    printf("Size of Union     : %d\n",sizeof(uE));
    return 0;
}
