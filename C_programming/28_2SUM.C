//argument with returntype
#include<stdio.h>
#include<conio.h>
int funt(int x,int y){
   int c;
   c=x+y;
   printf("%d",c);
   return c;
   }
   void main(){
   int a=2,b=3;
   funt(a,b);
   getch();
   }
