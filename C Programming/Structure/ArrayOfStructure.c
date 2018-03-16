#include<stdio.h>

struct student
{
    char name[30];
    int roll_no;
    char fav_sub[10];
};

void printRecord(struct student s, int i)
{
    printf("\nStudent%d Name : %s",i+1,s.name);
    printf("\nStudent%d Roll : %d",i+1,s.roll_no);
    printf("\nStudent%d Favourite Subject : %s",i+1,s.fav_sub);
}

int main()
{
    struct student s[3];

    for(int i=0; i<3; i++) {
        printf("\n\nEnter Student%d name :",(i+1));
        scanf("%s",s[i].name);
        printf("\n\nEnter Student%d Roll :",(i+1));
        scanf("%d",s[i].roll_no);
        printf("\n\nEnter Student%d favourite Subject :",(i+1));
        scanf("%s",s[i].fav_sub);
    }

    for(int i=0; i<3; i++) {
        printRecord(s[i],i);
    }
    return 0;
}
