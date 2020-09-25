#include<iostream>
#include<math.h>
using namespace std;
int power(int a,int n){//4,3//16,2//16*16,1
  //int m=sqrt(a);
	if(n<=1){
    	return a;
    }
  return a*power(a,n-1);//16,2//16*16,1
}

int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  int result=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<result;
}