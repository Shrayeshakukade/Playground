#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n=0;
  cin>>n;
  for(int i=1;i<=n;i++){
  	int sq=i*i;
    if(sq%2==0)
      cout<<sq-2<<" ";
    else
      cout<<sq-1<<" ";
  }
}