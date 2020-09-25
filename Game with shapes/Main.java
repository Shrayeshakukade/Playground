#include<iostream>
using namespace std;
#define pi 3.14
int main()
{
	int r,l;
	cin>>r>>l;
	float cArea = pi*r*r;
  	float sArea = l*l;
  	float cPeri = 2*pi*r;
  	float sPeri = 2*l*l;
  	int diameter = 2*r;
    if(cArea<=sArea && diameter == l)
      cout<<"circle can be inside a square";
  	else
      cout<<"circle cannot be inside a square";
}
//20217.89
//4225

//13266.5
//2025

//1808.64
//2304

//perimeter
//483.56
//8450


//408.2
//4050



//150.72
//4608
