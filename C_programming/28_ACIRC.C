
 //no argument with returntype
#include<stdio.h>
#include<conio.h>
  float funt(){
  float x=3.14,y=4,c;
  c=x*y*y;

  return c;
  }
  void main(){
  float s;
     s=funt();
     printf("%f",s);

     getch();
     }