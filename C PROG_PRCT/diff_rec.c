#include <stdio.h>

int subtract(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return subtract(a ^ b, (~a & b) << 1);
    }
}

int main() {
    int num1, num2, diff;
    printf("Enter First Numebr: ");
    scanf("%d", &num1);
    printf("Enter Second Numebr: ");
    scanf("%d", &num2);

    diff = subtract(num1, num2);
    printf("\nThe difference of %d and %d is: %d\n", num1, num2, diff);
    return 0;
}
