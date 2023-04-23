#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int pass;
printf("enter Your password");
scanf("%d",&pass);
for(pass=0;pass<=1234; ++pass){
printf("your passwprd is correct");}
printf("Your password is incorrect");
getch();
}