#include<iostream>
#include<math.h>
using namespace std;
int main(){
	int n;
  	cin>>n;
  	float seq=0.5;
  	for(int i=0;i<n;i++){
      if(i==0)
        cout<<seq<<" ";
      else{
      	float num = pow(3,i-1);
        
        //cout<<num<<endl;
        float re = seq+num;
        seq=re;
        cout<<seq<<" ";
      }
    }
  	
}