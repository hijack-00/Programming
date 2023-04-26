#include<stdio.h>

int fact(int n)
{
    if(n==0)
    {
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}

int c(int n, int r)
{
    if(r==0 || n==r)
    {
        return 1;
    }
    else{
        return c(n-1,r-1) + c(n-1,r);
    }
}


int main(){

        int x;

        x= c(4,2);

        printf("%d", x);

return 0;
}