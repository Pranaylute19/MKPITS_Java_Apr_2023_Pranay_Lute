//find the maximum value

#include<stdio.h>
#include<conio.h>
void main(){
int a,b,c;
printf("Enter the randomly 3 value");
scanf("%d%d%d",&a,&b,&c);
if(a<b){
printf("b is greter than a ",b);
}
else(b<c){
printf("c is greater than b ",b);
}
else(c<a){
printf("a is greater than c ",c);
}
getch();
}