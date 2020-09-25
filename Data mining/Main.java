#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n;
  cin>>n;
  int num=n;
  int oddSum=0,evenSum=0;
  int no;
  while(n>0){
  	no = n%10;
  	if(no%2==0){
    	evenSum=evenSum+no;
    }
  	else{
    	oddSum=oddSum+no;
    }
  	n=n/10;
  }
  if(evenSum==oddSum)
    cout<<"Yes";
  else
    cout<<"No";
}