#include<iostream>
#include<string>
using namespace std;
int main()
{
             string s1,s2;
             
             s1="Hello";
             cout<<"s1 string is :"<<s1<<endl;
             cout<<"Copy s1 String to s2:";
             for(int i=0;s1[i]!='\0';i++)
             {
                          s2[i]=s1[i];
               cout<<s2[i];
             
             }
}
