#include<stdio.h>
#include<string.h>

struct Employee
{
    char name[20];
    long salary;
    int emp_id;
};

void printDetail(struct Employee *e)
{
    printf("%s\t",e->name);
    printf("%d\t",e->salary);
    printf("%d\t\n",e->emp_id);
    printf("%s\t",(*e).name);
    printf("%d\t",(*e).salary);
    printf("%d\t\n",(*e).emp_id);
}

int main()
{
    struct Employee e1;
    struct Employee e2;

    strcpy(e1.name, "Rekha Bhardwaj");
    e1.salary = 50000;
    e1.emp_id = 103;

    strcpy(e2.name, "Santosh Rana");
    e2.salary = 45000;
    e2.emp_id = 104;

    printDetail(&e1);
    printDetail(&e2);

    return 0;
}
