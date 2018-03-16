#include<stdio.h>

struct Student
{
    char name[30];
    int roll;
    float marks;
};

int main()
{
    struct Student s[5];
    float totalMarks = 0;
    float maxMarks = 0;
    float avgMarks;
    int index = 0;

    for(int i=0; i<5; i++)
    {
        printf("\nEnter student%d Name : ",(i+1));
        scanf("%s",s[i].name);
        printf("Enter student%d Roll no. : ",(i+1));
        scanf("%d",&s[i].roll);
        printf("Enter student%d Marks : ",(i+1));
        scanf("%f",&s[i].marks);

        totalMarks = totalMarks + s[i].marks;

        if(maxMarks<=s[i].marks)
        {
            maxMarks = s[i].marks;
            index = i;
        }
    }

    avgMarks = totalMarks/5;

    printf("\n\n");
    printf("Student Details : \n");
    printf("-----------------\n");

    for(int i=0; i<5; i++)
    {
        printf("%s\t%d\t%f\n", s[i].name, s[i].roll, s[i].marks);
    }

    printf("--------------------\n");
    printf("\nAverage Maarks of Class : %f \n",avgMarks);
    printf("\nMax marks Obtained By : %s \nMarks obtained is : %f ", s[index].name, s[index].marks);

    getch();
    return 0;
}
