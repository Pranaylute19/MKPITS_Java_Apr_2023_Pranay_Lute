#include<stdio.h>
#include<conio.h>
void main(){
int num,rem ;
printf("enter the number ");
scanf("%d",&num);
rem=(num%2);
if(rem==0){
printf("This is even number =%d",&rem);
}
else{
printf("This is odd number = %d");}
getch();
}