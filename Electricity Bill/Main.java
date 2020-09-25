#include<iostream>
using namespace std;
int main()
{
	float c=0,Ec=0,unit=0;
      int t=0;
  	cin>>unit;
  if(unit<=200){
  	c = 0.5;
    t = c * unit;
    cout<<"Rs."<<t;
  }
  else if(unit>200 && unit<=400){
  	c = 0.65;
    Ec = 100;
    t = c*unit + Ec;
    cout<<"Rs."<<t;
  }
  else if(unit>400 && unit<=600){
  	c = 0.80;
    Ec = 200;
    t = c*unit + Ec;
    cout<<"Rs."<<t;
  }else if(unit>600){
	c = 1.25;
    Ec = 425;
    t = c*unit + Ec;
    cout<<"Rs."<<t;
  }
    
}