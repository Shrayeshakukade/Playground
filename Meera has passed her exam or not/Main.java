#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int rg[n];
  for(int i=0;i<n;i++)
    cin>>rg[i];
  int meera,f=0;
  cin>>meera;
  for(int i=0;i<n;i++){
  	if(meera==rg[i]){
      f=1;
    }
  }
    if(f==1)
      cout<<"She passed her exam";
  	else
      cout<<"She failed";
}