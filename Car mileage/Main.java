#include<iostream>
using namespace std;
int main()
{
	float m;
  	cin>>m;
  	int l,d;
  	cin>>l>>d;
  	int calc =m*l;
  	if(calc>d)
      cout<<"Can reach";
  	else
      cout<<"Cannot reach";
}