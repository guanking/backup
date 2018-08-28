#include<stdio.h>
void show(int* a, int n)
{
	int i;
	for(i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\n");
}
int main()
{
	int a[3]={1,2,3};
	show(a,3);
	int **b;
	int *c;
	c = a;
	b = &a;
	printf("%d\n", **b);
	return 0;
}
