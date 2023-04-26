#include <stdio.h>

int main() {
    int amount;
    int notes[5] = {2000, 500, 200, 100, 50};
    int count[5];

    printf("pls enter the amout: ");
    scanf("%d", &amount);
    printf("You entered amount value of: %d",amount);
    


    for (int i = 0; i < 5; i++) {
        count[i] = amount / notes[i];
        amount = amount % notes[i];
    }

    printf("Number of notes:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d notes of Rs %d\n", count[i], notes[i]);
    }

    return 0;
}
