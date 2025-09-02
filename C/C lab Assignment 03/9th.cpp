#include<stdio.h>
int main()
{
	int m,n,p,q,i,j,k;
	printf("Enter row&column of A matrix:");
	scanf("%d%d",&m,&n);
	printf("Enter row&column of B matrix:");
	scanf("%d%d",&p,&q);
	if(n==p)
	printf("Multiplication of Matrix A&B possible !\n");
	else
	printf("Please Enter correct row as per the Rule !\n");

	int A[m][n],B[p][q],M[m][q];
	printf("Enter %d  Element of A matrix:\n",m*n);
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&A[i][j]);
		}
	}
	printf("Enter %d Element of B matrix:\n",p*q);
		for(i=0;i<p;i++)
	{
		for(j=0;j<q;j++)
		{
			scanf("%d",&B[i][j]);
		}
	}
	printf("Matrix A is:\n");
		for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d\t",A[i][j]);
		}printf("\n");
	}
	printf("Matrix B is:\n");
		for(i=0;i<p;i++)
	{
		for(j=0;j<q;j++)
		{
			printf("%d\t",B[i][j]);
		}printf("\n");
	}
	printf("Multiplication of Matrix A & B:\n");
		for(i=0;i<m;i++)
      {
		for(j=0;j<n;j++)
		{
		M[i][j]=0;
		for(k=0;k<p;k++)
		{
		M[i][j]+=A[i][k]*B[k][j];	
		}
       } 
              	}
	
		for(i=0;i<m;i++)
	{
		for(j=0;j<q;j++)
		{
			printf("%d\t",M[i][j]);
		}printf("\n");
	}
	return 0;
}
