#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include <dlfcn.h>
int main(int argc, char** argv) {
	if(2 != argc)
	{
		printf("error usage!\n");
		return 0;
	}
	void* handler;
	char* error;
	typedef void (*pt_t)();

	handler = dlopen(argv[1], RTLD_NOW);
	if(!handler)
	{
		fprintf(stderr, "%s\n", dlerror());
		return 0;
	}
	dlerror();
	pt_t pf = (pt_t)dlsym(handler, "greet");
	if((error = dlerror()) != NULL)
	{
		fprintf(stderr, "%s\n", error);
		return 0;
	}
	pf();
	dlclose(handler);
	return 0;
}
