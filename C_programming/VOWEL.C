//no argumnt with no return type
#include<stdio.h>
#include<conio.h>
void funt(){
    char ch;
    scanf("%c",&ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='u'){
    printf("it is vowel");
    }
    else{
    printf("it is consonant");
    }
     }
     void main(){
     funt();
     getch();
     }



