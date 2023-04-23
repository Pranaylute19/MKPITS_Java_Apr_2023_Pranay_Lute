#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int num1,num2;
printf("enter the two number");
scanf("%d%d",&num1,&num2);
if(num1<num2){
printf("Division is possible");
}
else{
printf("Division is not possible");
}
getch();
}