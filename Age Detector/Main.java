#include<iostream>
using namespace std;
int main()
{
	int bYear,cYear,age;
  	cin>>bYear>>cYear;
	if(bYear>cYear){
		int x = 1900 + bYear;
      	int y = 2000 + cYear;
      	age = y-x;	
      	cout<<age;
    }	
  	else{
    	int x = 2000 + bYear;
      	int y = 2000 + cYear;
      	age = y-x;	
      	cout<<age;
    }
}