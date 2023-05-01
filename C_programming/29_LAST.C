#include<stdio.h>
#include<conio.h>
void main(){
   int row,col,sp;
    for(row=7;row>=1;row--){
       for(sp=7;sp>=row;sp--){
	   printf(" ");
	   }
	   for(col=1;col<=sp;col++){
	   if(row%2!=0){
	   printf("  ");
	    printf("%d",row);
	    }   }
	   printf("\n");
	   getch();
	   }
	   }