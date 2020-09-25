#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int no=n;
  int sum=0,num;
  while (n!=0){
  	num=n%10;
    sum=sum+num;
    n=n/10;
  }
  if(no%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
    
}