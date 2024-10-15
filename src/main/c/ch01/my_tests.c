#include <stdio.h>
#include "minunit.h"

// Functions to test
int add(int a, int b) {
    return a + b;
}

int multiply(int a, int b) {
    return a * b;
}

// Unit tests
int tests_run = 0;

static char* test_add() {
    mu_assert("Error, add(2, 3) != 5", add(2, 3) == 5);
    return 0;
}

static char* test_multiply() {
    mu_assert("Error, multiply(2, 3) != 6", multiply(2, 3) == 6);
    return 0;
}

static char* all_tests() {
    mu_run_test(test_add);
    mu_run_test(test_multiply);
    return 0;
}

int main() {
    char *result = all_tests();
    if (result != 0) {
        printf("%s\n", result);
    } else {
        printf("All tests passed!\n");
    }
    printf("Tests run: %d\n", tests_run);

    return result != 0;
}
