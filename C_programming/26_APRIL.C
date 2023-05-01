#include<stdio.h>
#include<conio.h>
   void main(){
	int row ,col,num;
	clrscr();
	for(row=1;row<=5;row++){
	     for(col=5;col>=row;col--)  {
		printf(" ");
		}
		for(num=1;num<=row;num++){
		printf(" ");
		printf("%d",row);
		}

		printf("\n");
			getch();
		}}