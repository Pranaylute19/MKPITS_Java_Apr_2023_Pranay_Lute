#include<stdio.h>
#include<conio.h>
void main(){
int num1 ,num2,res;
printf("enter the two number");
scanf("%d%d",&num1,&num2);
res=num1%num2;
if(res==0)  {
printf("this valued are multiplied");
}
else{
printf("this value u can not multiplied");
}
getch();
}