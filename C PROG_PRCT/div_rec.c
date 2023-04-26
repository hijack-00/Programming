#include<stdio.h>

int divis(int a, int b);

int main(){
    int a,b,n;
    printf("Enter number for a: ");
    scanf("%d",&a);
    printf("Enter number for b: ");
    scanf("%d",&b);

    n=divis(a,b);

    printf("Answer is: %d",n);

    

return 0;
}

int divis(int a, int b)
{
    if(a-b==0)
    {
        return 1;
    }
    else{
        return 1+divis(a-b,b);
    }
}
