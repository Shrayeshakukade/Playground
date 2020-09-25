#include<iostream>
using namespace std;
int main()
{
	int n,count=0;
  	cin>>n;
  	do{
    	int r=n%10;
      	count++;
      	n=n/10;
    }while(n>0);
  cout<<count;
  
}