#include<stdio.h>
#include<conio.h>

void main(){
   int h,spc,str;
   for(h=1;h<=5;h++){
       for(spc=1;spc<=h;spc++){
       printf(" ");
       }
       for(str=5;str>=h;str--){
	  printf(" *");
	  }

       printf("\n");
       getch() ;
}
       }