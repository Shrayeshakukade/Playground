#include<iostream>
#include<math.h>
using namespace std;
int help(int m,int n,int req){
	int result=0,flag=0;
  	result=pow(m,n);
  	if(result>=req)
		flag=1;
      else
		flag=0;
	return flag;
}
int main(){
	int m,n,req;
  	cin>>m>>n>>req;
  	int r=help(m,n,req);
  	if(r==1)
    	cout<<"Doctor, you can proceed with your experiment.";
  	else
    	cout<<"Sorry Doctor! You need more bacteria.";

  	return 0;
}