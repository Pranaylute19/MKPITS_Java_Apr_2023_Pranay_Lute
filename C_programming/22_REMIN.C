#include<stdio.h>
#include<conio.h>
void main(){
int num1 ,num2,num3,res1;
printf("Enter the value");
scanf("%d%d%d",&num1,&num2,&num3);
res1=num1+num2+num3;

if(res1%7==2||res1%7==3){
printf("You can divide by 7 and reminder is 2 or 3");
}
else{
printf("You can divide by 7 and reminder is 0");
}
getch();
}