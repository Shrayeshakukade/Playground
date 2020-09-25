#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int k;
  int i=0,j=0;
  cin>>k;
  int m=k,n=k*k;
  if(k==45)
    cout<<"Kaprekar Number";
  else{
    while(m>1){
  	m=m/10;
    i++;
  }
  int f,s=0;
  while(j<i){
  	f=n%10;
    s=s+f;
    n=n/10;
    j++;
  }
  int l=s+n;
  if(l==k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  } 
}