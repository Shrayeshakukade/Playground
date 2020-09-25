#include<iostream>
using namespace std;
int factorial(int n){//5
	if(n<=1){
    	return n;
    }
  else
  	return n*factorial(n-1);//5*fact(4)
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int result = factorial(n);
  cout<<"The factorial of "<<n<<" is "<<result;
}