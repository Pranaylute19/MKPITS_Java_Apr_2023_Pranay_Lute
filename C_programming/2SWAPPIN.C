#include<stdio.h>
#include<conio.h>


void main(){
clrscr();
int a,b,c,d;
printf("enter the value ");
c=a;
a=b;
b=c;
scanf("%d%d",&a,&b);
printf("This is the value of a  %d",a);
printf("this is the value of b  %d",b);

d=a;
a=b;
printf("this is the value of a  %d ",b);
printf("this is the value of b  %d ",d);
getch();
}



