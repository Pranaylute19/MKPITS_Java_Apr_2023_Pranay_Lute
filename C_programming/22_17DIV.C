#include<stdio.h>
#include<conio.h>
void main(){
int num1,num2,num3,res,res1;
printf("enter the three number for divisible");
scanf("%d%d",&num1,&num2);
res=num1+num2;
res1=res%17;
if(res1!=0){
printf("You can not Divisible by 17");
}
else{printf(
"You can Divisible by 17");
}
getch();
}
