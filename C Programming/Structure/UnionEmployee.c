#include<stdio.h>
#include<string.h>

union Employee
{
    char name[20];
    long salary;
    int emp_id;
};

int main()
{
    union Employee e1;

    printf("\nInitializing and Accessing all Member at a time :\n");
    printf("*************************************************\n");
    printf("\nEnter Employee name :");
    scanf("%s",&e1.name);
    printf("\nEnter Employee Salary :");
    scanf("%d",&e1.salary);
    printf("\nEnter Employee Id :");
    scanf("%d",&e1.emp_id);
    printf("\nEmployee name is : %s\t",e1.name);
    printf("\nEmployee salary is : %d\t",e1.salary);
    printf("\nEmployee id is : %d\t",e1.emp_id);

    printf("\n\n\nInitializing and Accessing Members one by one :\n");
    printf("***********************************************\n");
    printf("\nEnter Employee name :");
    scanf("%s",&e1.name);
    printf("\nEmployee name is : %s\t",e1.name);
    printf("\n\nEnter Employee Salary :");
    scanf("%d",&e1.salary);
    printf("\nEmployee Salary is : %d\t",e1.salary);
    printf("\n\nEnter Employee Id :");
    scanf("%d",&e1.emp_id);
    printf("\nEmployee id is : %d\t",e1.emp_id);

    return 0;

}
