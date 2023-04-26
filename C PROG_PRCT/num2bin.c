// Program to convert a number to binary
#include <stdio.h>

int main() {
    int num, binary[32], index = 0;

    printf("Enter a decimal number: ");
    scanf("%d", &num);

    while (num > 0) {
        binary[index] = num % 2;
        num /= 2;
        index++;
    }

    printf("The binary representation of the number is: ");
    for (int i = index - 1; i >= 0; i--) {
        printf("%d", binary[i]);
    }
    printf("\n");

    return 0;
}

// Explanation:

// We first declare three variables num, binary (an array of integers that will hold the binary digits), and index (to keep track of the index of the current binary digit in the array).
// We prompt the user to enter a decimal number using printf and scanf.
// We then start a while loop that will continue until num becomes 0. In each iteration, we take the remainder of num divided by 2 and store it in the binary array at the current index. We then divide num by 2 and increment index.
// After the while loop, we print the binary representation of the number using a for loop that starts from the last index of the binary array and goes backwards. We print each binary digit using printf.
// Finally, we print a newline character to make the output more readable, and return 0 to indicate successful execution of the program.