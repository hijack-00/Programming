#include<stdio.h>

int func(int a, int b)
{

    if(b==0){
    return 1;
    }
    else
    {
        return a*func(a,b-1);
    }

    
}

int main(){

    int n=2,m=5,c;
    c= func(n,m);

    printf("ans is: %d", c);

return 0;
}