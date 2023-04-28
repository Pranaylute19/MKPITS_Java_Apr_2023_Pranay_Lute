#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
char c1,c2;
for(c1='A';c1<='D';c1++){
    for(c2='A';c2<=c1;c2++){
    printf("%c",c2);
    }
    printf("\n");
    }
    getch();
    }