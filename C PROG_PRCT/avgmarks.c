#include<stdio.h>

int main(){

    int eng,hin,maths,sci,sst,total;

    printf("pls enter marks for English: ");
    scanf("%d", &eng);

    printf("pls enter marks for Hindi: ");
    scanf("%d", &hin);
    
    printf("pls enter marks for Maths: ");
    scanf("%d", &maths);
    
    printf("pls enter marks for Science: ");
    scanf("%d", &sci);
    
    printf("pls enter marks for Sst: ");
    scanf("%d", &sst);

    total= eng+hin+maths+sci+sst;

    printf("Total MArks: 500");
    printf("\nTotal marks obtained are: %d", total);

    int avg= total/5;
    printf("\nAverage marks obtained are: %d", avg);


// Calculating Grades
    // if()


return 0;
}