#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,temp=0,count=0;
  cin>>n;
  while(sum<n){
  	cin>>temp;
    sum=sum+temp;
    //cout<<again<<endl;
    count++;
  }
  cout<<"The number of turns is "<<count;
}