// write a program to check whether the number entered is a 3 digit number or not


#include <stdio.h>

int main() {
    int num, count = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    while (num != 0) {
        num /= 10;
        count++;
    }

    if (count == 3) {
        printf("The number is a 3-digit number.\n");
    } else {
        printf("The number is not a 3-digit number.\n");
    }

    return 0;
}


// Explanation:

// We first declare two variables num and count. num will hold the user input number and count will keep track of the number of digits in num.
// We prompt the user to enter a number using printf and scanf.
// We then start a while loop that will continue until num becomes 0. In each iteration, we divide num by 10 (to remove the rightmost digit) and increment count.
// Finally, we check whether count is equal to 3 or not. If it is, we print that the number is a 3-digit number. Otherwise, we print that it is not a 3-digit number.