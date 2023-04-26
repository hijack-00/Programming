#include<stdio.h>

int main(){

    int x,n, n1=0, n2=1, temp;

    printf("pls enter the number: ");
    scanf("%d", &n);

    
    printf("%d %d ", n1,n2);
    for(int i=1; i<=n-2; i++)
    {
    temp= n1+n2;
    n1=n2;
    n2=temp;
    printf("%d ", temp);

    }

    printf("pls enter the element no to find");
    scanf("%d", &x);

    if(x<=1)
    {
        printf("%d", x);
    }
    else{
        
        printf("%d");
    }

return 0;
}