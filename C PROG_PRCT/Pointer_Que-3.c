#include<stdio.h>

int times(int *a);
int main(){

    int x=3;

    printf("value before swap is: %d ",x);

    

    printf("\nvalue after swap is: %d ",times(&x));



return 0; 
}

int times(int *a)
{
    int x = *a*10;

    return x;
}
