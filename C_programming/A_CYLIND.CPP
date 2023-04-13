#include<stdio.h>
#include<conio.h>
void main() {
int num1,num2 ,res;
float pi=3.14;
printf("enter the value of radius and height");
scanf("%d%d",&num1,&num2);
res=pi*num1*num1*num2;
printf("%f",res);
getch();
}