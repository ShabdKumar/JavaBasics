#include<stdio.h>
union team
{
    char *name[20];
};

int main()
{
    union team t1;
    union team *t2;
    t2 = &t1;
    strcpy(t1.name, "India");
    printf("team name : %s",t2->name);
    printf("\nteam name : %s",(*t2).name);

    return 0;
}
