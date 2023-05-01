#include<stdio.h>
#include<conio.h>
void main(){
  int r,sp,str;
  clrscr();


   for(r=5;r>=1;r--)
   {
   for(sp=1;sp<=20-r;sp++)
   {
   printf("  ");
      }

      for(str=1;str<=r;str++)
      {
      printf("%d",str);
      }
	 printf("\n");
	 }
	 getch();
}