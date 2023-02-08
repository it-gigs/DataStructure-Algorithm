#include<stdio.h>

int fibonacci(int n);	

main()
{
	int terms,i;
	
	printf("Enter number of terms : ");
	scanf("%d", &terms);
	
	for(i=0; i<=terms; i++)
		printf("%d  ", fibonacci(i));
	printf("\n");
}
 
int fibonacci(int n)		
{
	if(n==0 )
		return 0;
	if(n==1)
		return 1;
	return fibonacci(n-1) + fibonacci(n-2);
}