#include<stdio.h>
#include<conio.h>
void main(){
float pi=3.142, res;
int num1,num2;
printf("Enter the radius ,height");
scanf("%d%d",&num1,&num2);
res=0.333*pi*num1*num1*num2 ;
printf("%f",res);
getch();
}