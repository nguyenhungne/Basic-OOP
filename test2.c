#include <stdio.h>

int main() {
    int M[2][3] = {{1, 4, -3}, {2, 1, 4}};
    
    for (int i = 0; i < 2; i++) {
        for (int j = 2; j >= 0; j--) {
            if (M[i][j] > M[j][1]) {
                M[i][j] = M[i][0];
            } else {
                printf("%d", M[i][j]);
            }
        }
    }

    return 0;
}
