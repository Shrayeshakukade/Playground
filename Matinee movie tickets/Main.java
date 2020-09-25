#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int age;
  	float time;
  	float cost;
  	cin>>age>>time;
  	if(time>=12.00){
  		if(age>=13){
    		cost = 5.00;	
    	}
  		else{
  			cost = 2.00;
  		}
    }
  else{
  	if(age>=13)
      cost = 8.00;
    else
      cost = 4.00;
  }
  cout<<"$"<<fixed<<setprecision(2)<<cost;
}