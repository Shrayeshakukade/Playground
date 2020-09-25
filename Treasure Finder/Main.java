#include<iostream>
using namespace std;
int main(){
	int b1,b2,b3;
  	cin>>b1>>b2>>b3;
int sum=6;
  int gp=0,sp=0;
  //largest no. position
  if(b1>b2 && b1>b3){
	if(b2>b3){
    	gp=b2;
    }  
    else{
    	gp=b3;
    }
  }
  else if(b2>b1 && b2>b3){
  	if(b1>b3){
    	gp = b1;
    }
    else{
    	gp=b3;
    }
  }
  else
  {
  	if(b1>b2){
    	gp = b1;
      }
    else{
    	gp=b2;
    }
  } 
  cout<<"The treasure is in box which has number "<<gp<<endl;
  int t=0;
  for(int i=1;i<=5;i++)
  {
  	if(b1%i==0 && b2%i==0 && b3%i==0)
   		t=i;   
  }
      cout<<"The code to open the box is "<<t;
  
}