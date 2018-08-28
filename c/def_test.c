#include<stdio.h>
#define DEBUG 0
int main()
{
#if 0 == DEBUG
	printf("debug\n");
#else
	printf("normal\n");
#endif
	return 0;
}
