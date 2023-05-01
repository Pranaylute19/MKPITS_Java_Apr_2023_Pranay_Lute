#include<stdio.h>
#include<conio.h>
 void main(){
  int row,col,sp;
    for(row=65;row<=67;row++){
	for(col=67;col>=row;col--) {
	   printf(" ");
	   }
	   for(sp=65;sp<=row;sp++){
	   printf(" ")  ;

	   printf("%c",sp);
	   }
	   printf("\n");
	   getch();
}	   }

