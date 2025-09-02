//addition of two matrix//
#include<stdio.h>
int main()
{int n=2,m=3;
	int matrix1[2][3]={{10,20,30},{40,50,60}};
	int matrix2[2][3]={{10,20,30},{40,50,60}};
	int i,j;
	int ADD[2][3];
		//1 st//
	
	//displays matrix1//
	printf("Matrix1 Element\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			printf("%d\t",matrix1[i][j]);
		}
		printf("\n");
	}
	//displys matrix2//
printf("\n\nMatrix2 Element\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			printf("%d\t",matrix2[i][j]);
		}
		printf("\n");
	}
	//addition//
	printf("\n\nAddition of matrix1 & Matrix2 \n");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{ADD[i][j]=matrix1[i][j]+matrix2[i][j];
		
			printf("%d\t",ADD[i][j]);
		}
		printf("\n");
	}
	return 0;
	
}
