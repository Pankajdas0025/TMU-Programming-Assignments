#include<stdio.h>
int main()
{
	int matrix[2][3]={{10,20,30},{40,50,60}};
	int i,j;
	//displays matrix//
	printf("Matrix Example\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",matrix[i][j]);
		}
		printf("\n");
	}
	
	//displays  Transpose of matrix//
	printf(" \nTranspose of a Matrix\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d\t",matrix[j][i]);
		}
		printf("\n");
	}
	return 0;
}
