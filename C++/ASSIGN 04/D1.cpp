//Q:1 linear search 
#include<iostream>
using namespace std;
int main(){
	int n,s;
	cout <<"Enter the size of array:";
	cin >>n;
	int A[n];
	//input elements//
	cout <<"Enter the array element:";
	for(int i=0;i<n;i++){
		cin >>A[i];
	}
	//search
	cout<< "Enter target key (should be from your input) :";
	cin>>s;
	for(int i=0;i<n;i++){
		if(A[i]==s){
			cout <<"Your Key " <<s<<" found in index "<<i;
			return 0;
		}}cout<< "Not found !!";

}
