#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  //fibonacci series
  int a=0,b=1,c=0;
  for(int i=0;i<n-2;i++){
  	c=a+b;

    a=b;
    b=c;
  }      cout<<c;

  
}