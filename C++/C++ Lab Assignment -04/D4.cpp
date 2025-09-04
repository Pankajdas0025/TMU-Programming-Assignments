//Q:4: bubble  sort ........................................
#include<iostream>
using namespace std;
int main(){
	int n,temp;
	cout <<"Enter size of array : ";
	cin >>n;
	int myarr[n];
	//array element inputs
	cout <<"Enter "<<n<<" array elements  :";
	for(int i=0;i<n;i++){
		cin >>myarr[i];
	}//Algorithm for bubble  sort
	for(int i=n;i>0;i--){
		for(int j=0;j<n-1;j++)
		{      
			if(myarr[j]>myarr[j+1]){
			temp=myarr[j];
			myarr[j]=myarr[j+1];
			myarr[j+1]=temp;
			}}}
	//print result 
	cout << "Shorted Arry is : " "\n";
	for(int i=0;i<n;i++){
		cout <<myarr[i] <<"\t";
	}
}
