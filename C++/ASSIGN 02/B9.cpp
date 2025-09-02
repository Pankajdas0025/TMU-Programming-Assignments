//Q9: reverse of given string

#include<iostream>
#include <bits/stdc++.h>
#include<string>
using namespace std;
int main()
{
 string message;  
 cout<<"Enter your string :";
// cin>>message;
// cin.get(str, 100); 
 getline(cin,message);
 
      reverse(message.begin(), message.end());
      cout<<endl<<"Your reverse  string is: "<<message;
      return 0;
}
