#include <stdio.h>

int main()
{
    int n,i=1;

    printf("Enter a value for cube number: ");
    scanf("%d", &n);

    while(i<=n){
        printf("%d\n",i*i*i);
        i++;
    }

    return 0;
}

