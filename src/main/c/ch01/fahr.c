#include <stdio.h>

#define LOWER 0 // lower limit of temperature table
#define UPPER 300 // upper limit
#define STEP 20 // step size

/* 
    print Fahrenheit-Celsius table
    for fahr = 0, 20, ..., 300
*/
main() {
    float fahr, celsius;

    printf("Using while loop ...\n");
    fahr = LOWER;
    while (fahr <= UPPER / 2) {
        celsius = 5.0 * (fahr - 32.0) / 9.0;
        printf("%3.0f\t%6.1f\n", fahr, celsius);
        fahr += STEP;
    }

    printf("\n");
    printf("Using for loop ...\n");
    for (; fahr <= UPPER; fahr += STEP) {
        celsius = (5.0 / 9.0) * (fahr - 32);
        printf("%3.0f\t%6.1f\n", fahr, celsius);
    }
}
