#include <stdio.h>

int main() {
    int i;
    
    printf("Numbers divisible by 7 and multiples of 5 between 1 and 2000 are: \n");
    
    for (i = 1; i <= 2000; i++) {
        if (i % 7 == 0 && i % 5 == 0) {
            printf("%d ", i);
        }
    }
    
    return 0;
}
