#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	string door;
  	int rail;
  	cin>>door;
  	cin>>rail;
  
  	if(door=="front"){
    	if(rail==1)
    		cout<<"Left Handed";
  		else
      		cout<<"Right Handed";
    }
    if(door=="rear"){
    	if(rail==1)
    		cout<<"Right Handed";
  		else
      		cout<<"Left Handed";
    }
}