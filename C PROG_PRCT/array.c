#include<stdio.h>

int main(){

    int arr[3][3];

        printf("Enter input for arrays\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                printf("Enter value at position: %d,%d: ",i,j);
                scanf("%d", &arr[i][j]);
            }
        }

        printf("Array printing: \n");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == 0 || i+j == 2) {
                    printf("%d",arr[i][j]);

                } else {
                    printf(" ");

                }
            }
            printf("\n");

        }

return 0;
}