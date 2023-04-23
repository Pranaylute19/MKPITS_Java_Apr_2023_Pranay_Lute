#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num1,num2,num3,num4,num5;
printf("Enter the the numbers :");
scanf("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);

if(num1<num2 && num2<num3 && num3<num4 && num4<num5){
printf("ascending number");
}else{
printf("Descending value");}
getch();
}