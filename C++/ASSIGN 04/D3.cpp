j//Q:3   selection sort ........................................
#include<iostream>
using namespace std;
int main(){
	int n,m,loc,temp;
	cout <<"Enter size of array : ";
	cin >>n;
	int myarr[n];
	//array element inputs
	for(int i=0;i<n;i++){
		cin >>myarr[i];
	}//Algorithm for selection  sort
	for(int i=0;i<n-1;i++){
		m=myarr[i];
		loc=i+1;
		for(int j=i+1;j<n;j++)
		{       if(m>myarr[j]){
				m=myarr[j];
				loc=j;
			}
			if(myarr[loc]<myarr[i]){
			temp=myarr[loc];
			myarr[loc]=myarr[i];
			myarr[i]=temp;
			}}}
	//print result 
	cout << "Shorted Arry is : " "\n";
	for(int i=0;i<n;i++){
		cout <<myarr[i] <<"\t";
	}
}
