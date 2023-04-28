#include<stdio.h>
#include<conio.h>
void main(){
float pi=3.14, res;
int num1,num2;
printf("Enter the value of Major axis , Minor Axis ");
scanf("%d%d",&num1,&num2);
res=pi*num1*num2;
printf("%f",res);
getch();
}