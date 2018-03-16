#include<stdio.h>

struct Employee
{
    char name[20];
    int age;
    char department[30];
};

int main()
{
    struct Employee e1;
    FILE *fp;
    char c;

    printf("Enter Employee Name, Age & Designation : \n");
    scanf("%s%d%s", &e1.name, &e1.age, &e1.department);

    fp = fopen("Employee_Details.txt","w");
    fprintf(fp,"%s\t%d\t%s", e1.name, e1.age, e1.department);
    fclose(fp);

    fp = fopen("Employee_Details.txt","r");
    while((c=fgetc(fp))!=EOF)
    {
        printf("%c",c);
    }
    fclose(fp);

    getchar();
    return 0;
}
