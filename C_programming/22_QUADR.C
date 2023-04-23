#include<stdio.h>
#include<conio.h>
void main(){
clrscr();
int x,y;
printf("enter the quadrant");
scanf("%d%d",&x,&y);
if(x>0 && y>0){
printf("this is first quadrant");
}else if(x<0 && y>0){
printf("this is second quadrant");
}
else if(x<0 && y<0){
printf("this is third quadrant");
}
else if(x>0 && y<0){
printf("this is fourth quadrant");
}
getch();
}