#include<stdio.h>

int fib(int n)
{
    int t1=0, t2=1, s;

    // printf("%d %d",t1,t2);

    for(int i=2; i<n;i++)
    {
        s=t1+t2;
        t1=t2;
        t2=s;
    }

    return s;
}


int main(){

    int x;

    x= fib(5);

    printf("%d",x);

return 0;
}