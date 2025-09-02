//Q10: check palindrome

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
 string constant=message;
      reverse(message.begin(), message.end());
      if(constant==message)
      {
      
      cout<<endl<<"This string is Palindrome";
      }
      else  cout<<endl<<"This string is NOT Palindrome";
      return 0;
}
