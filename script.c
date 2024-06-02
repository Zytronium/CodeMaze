#include <stdio.h>
#include <string.h>

int main(void)
{
    int i;
    char buffer[256];

    for (i = 0; i <= 90; i++) {
        sprintf(buffer, "echo \"Path1Tiles.TILE%d,\" >> app/src/main/java/com/example/codeMaze/MainActivity.kt", i);
        system(buffer);
    }
    return 0;
}