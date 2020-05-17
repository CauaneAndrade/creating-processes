#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main () {
    pid_t pid;
    // fork um processo filho
    pid = fork();

    // se ocorrer um erro
    if (pid < 0) {
        fprintf (stderr, "Forks Failed");
        exit(-1);
    }
    // processo filho
    else if (pid == 0) {
        execlp("/bin/ls", "ls", NULL);
    }
    // processo pai
    else {
        wait (NULL);
        printf("Child Complete");
        exit(0);
    }

}
