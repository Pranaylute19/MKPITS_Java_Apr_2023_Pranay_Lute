#include<stdio.h>
#include<conio.h>
void main(){
int num1,num2,num3,num4,num5 , res=0 ;
printf("enter the first number");
scanf("%d",&num1);
printf("enter the second number");
scanf("%d",&num2);
printf("enter the third number");
scanf("%d",&num3);
printf("enter the fourth number");
scanf("%d",&num4);
printf("enter the fifth number");
scanf("%d",&num5);

if(num1%2==1){
res=res+num1;}
if(num2%2==1){
res=res+num2;}
if(num3%2==1){
res=res+num3;}
if(num4%2==1){
res=res+num4;}
if(num5%2==1){
res=res+num5;}


 printf("this is sum of odd number %d",res);

getch();
}