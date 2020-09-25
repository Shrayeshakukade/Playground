#include<iostream>
using namespace std;
int main(){
	int n;
  cin>>n;
  int lterm=1,rterm=n*n+1;
  for(int i=n;i>0;i--){
  	for(int dash=n;dash>i;dash--){
    	cout<<"--";
    }
    for(int j=1;j<=i;j++){
    	cout<<lterm<<"*";
      	lterm++;
    }
    for(int j=1;j<=i;j++){
    	cout<<rterm;
      if(j<i)
        cout<<"*";
      rterm++;
    }
    rterm=rterm-(i-1)*2-1;
    cout<<endl;
  }
}