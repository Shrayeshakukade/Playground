#include<iostream>
using namespace std;
int main()
{
  int r,c,n,t,t1;
  cin>>r>>c>>n;
t = r*c;
  	t1 = t - c;
  	if(n%r == 0 && n%c == 0 && n<=t1){
    	cout<<"It is a mango tree";
    }
  else
      cout<<"It is not a mango tree";

}