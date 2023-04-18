#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int a,y,w,d;
printf("enter the days");
scanf("%d",&a);
y=a/365;w=a/7;d=a;
printf("years %d ",y);
printf("weeks %d " ,w);
printf("days %d ",d);
getch();
}