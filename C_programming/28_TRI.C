//Argument with non return type
#include<stdio.h>
#include<conio.h>
 void funt(float x, float y)
 {
 float res;
 clrscr();
 res=0.5*x*y;
 printf("%f",res);
 }
 void main(){
 float a=4,b=6;
 funt(a,b);
 getch();
 }
