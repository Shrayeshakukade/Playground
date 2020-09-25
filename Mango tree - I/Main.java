#include<iostream>
using namespace std;
int main()
{
	int r,c,n;
  	cin>>r>>c>>n;
  	if(r*c>=n && ((r*c)-n)>n){
    	cout<<"Yes";
    }
  else
    cout<<"No";
}