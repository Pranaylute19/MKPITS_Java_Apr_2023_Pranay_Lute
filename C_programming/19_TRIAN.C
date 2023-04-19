#include<stdio.h>
#include<conio.h>
void main(){
float x,y,z,perimeter;
printf("enter the sides ");
scanf("%f%f%f",&x,&y,&z);


if(x<(y+z)&&y<(x+z)&&z<(x+y)){
printf("You can create triangle");
perimeter=x+y+z;
printf("perimeter = %f",&perimeter);

}
else{

printf("You cannot create triangle");
}
getch();
}