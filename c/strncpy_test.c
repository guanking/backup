#include<stdio.h>
#include<string.h>
#define N 5
int main()
{
	char *str = "0123456789";
	char a[N + 1];
	strncpy(a, str, N+2);
	printf("%d\n", strlen(a));
	puts(a);
	return 0;
}
