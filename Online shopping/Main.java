#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int amtF,disF,chargeF;
  int amtS,disS,chargeS;
  int amtA,disA,chargeA;
  cin>>amtF>>disF>>chargeF>>amtS>>disS>>chargeS>>amtA>>disA>>chargeA;
  int f = amtF - (amtF*disF/100) + chargeF;
  int s = amtS - (amtS*disS/100) + chargeS;
  int a = amtA - (amtA*disA/100) + chargeA;
	
  cout<<"In Flipkart Rs."<<f<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<a<<endl;

  if(f<=s && f<=a)
    cout<<"He will prefer Flipkart";
  if(s<f && s<a)
    cout<<"He will prefer Snapdeal";
  if(a<=f && a<=s)
    cout<<"He will prefer Amazon";

}