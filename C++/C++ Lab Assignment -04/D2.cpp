//Q2; binary search
#include<iostream>
using namespace std;
int main(){
	int n,s;
	cout <<"Enter the size of array:";	cin >>n;
	int A[n];
	//input elements//
	cout <<"Enter the array element(Ascending Or Descending order):";
		for(int i=0;i<n;i++){
		cin >>A[i];}
	cout <<"Enter target element for searching:";cin >>s;
	int lp=0,Rp=n-1;
	while(lp<=Rp){
		int mid=(lp+Rp)/2;
		if(A[mid]==s){
			cout <<"Target Element\t "<<s<<" found at index possition\t"<<mid;
			return 0;
		}
		else if(A[mid]<s){
			lp=mid+1;
			
		}else{
			Rp=mid-1;
		}}
	cout <<"SORRY your target Element Not Found !";
}


