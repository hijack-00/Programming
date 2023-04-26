#include<stdio.h>


void avgnsum(int a, int b, int *sum, float *avg)
{
    *sum= a + b;

    *avg= (float)(*sum)/2;
}

int main(){

    int a, b, sum;
    float avg;

    a=36;
    b=97;

    avgnsum(a,b,&sum,&avg);

    printf("the value of Sum is: %d",sum);

    printf("\nthe value of Average is: %f",avg);
    

return 0;
}