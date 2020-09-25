#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int n;
	float t,finalT,temp;
  	cin>>n>>t;
  	temp = n*t;
  	if(n<=2){
    	finalT = temp - t*50/100;
        cout<<fixed<<setprecision(2)<<finalT;
    }if(n==3){
    	finalT = 2*t;
        cout<<fixed<<setprecision(2)<<finalT;
    }if(n>3){
    	cout<<"Number of items is more";
    }
}