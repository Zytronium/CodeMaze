#include <stdio.h>
#include <strings.h>
int main(void)
{
    int i;
    for(i = 0; i <= 91; i++) {
        system("echo \"TEST%d\" >> app/src/main/java/com/example/codeMaze/MainActivity.kt", i);
    }
    return (0);
}