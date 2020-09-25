#include<iostream>
using namespace std;
int main()
{
	int b,noA,noC; 
  int a = 75,c = 30;
  	cin>>b>>noA>>noC;
  	int Twt = noA*a + noC*c;
  	if(b<Twt)
      cout<<"Boat will drow";
  	else
      cout<<"Boat is stable";
}