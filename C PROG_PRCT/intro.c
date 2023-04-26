#include<stdio.h>
#include<stdlib.h>

int main(){

    int a[5];
    int *p;

    p=(int*)malloc(5*sizeof(int));



    printf("%d",p);

    // free(p);
return 0;
}