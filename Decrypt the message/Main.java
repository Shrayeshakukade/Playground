#include<iostream>
using namespace std;
int main(){
	int n1=0,n2=0;
  	cin>>n1;
  	cin>>n2;
  //cout<<n1<<n2;
  	int n = n1+n2;
  //cout<<n<<endl;
  	int sum=0,div,m=n;
  	for(int i=1;i<n;i++){
    	div = n%i;
      	//cout<<div<<endl;
      	if(div==0){
          sum=sum+i;
          //cout<<sum;
        }
      }
  	if(sum==n){
      cout<<"They can read the message";
    }
  	else{
      cout<<"They can't read the message";
	}
  return 0;
}