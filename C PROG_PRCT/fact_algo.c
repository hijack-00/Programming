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
    int t1,t2,t3;
    t1=fact(n);
    t2=fact(r);
    t3= t1/(t2*t3);
}


int main(){

        int x;

        x= c(4,2);

        printf("%d", x);

return 0;
}