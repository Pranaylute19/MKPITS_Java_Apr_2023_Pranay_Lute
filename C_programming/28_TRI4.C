//argument with returntype
#include<stdio.h>
#include<conio.h>
 float funt(float x,float y){
     float res;
     clrscr();
     res=0.5*x*y;
     printf("%f",res);
     return res;
     }
     void main(){
      float a=3,b=4;
      funt(a,b);
      getch();
      }