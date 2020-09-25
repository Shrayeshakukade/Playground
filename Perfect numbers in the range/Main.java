#include<iostream>
using namespace std;
int main(){
	int start,end;
  	cin>>start>>end;
  	int sum;
  	for(int i=start;i<=end;i++){
      sum=0;
		for(int j=1;j<=i/2;j++){
        	if(i%j==0){
              sum=sum+j;
            }
        }
      if(sum==i)
        cout<<sum<<" ";
    }
}