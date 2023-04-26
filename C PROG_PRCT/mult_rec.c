#include<stdio.h>

int mult(int a, int b);


int main(){
    int a,b,n;
    printf("Enter number for a: ");
    scanf("%d",&a);
    printf("Enter number for b: ");
    scanf("%d",&b);

    n=mult(a,b);

    printf("Answer is: %d",n);




    

return 0;
}

int mult(int a, int b)
{
    if(a==0 || b==0)
    {
        return 0;
    }
    else{
        return a+mult(a,b-1);
    }
}