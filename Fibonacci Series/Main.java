#include<iostream>
using namespace std;

int fibo(int n){
  if(n==1 || n==0){
  	return n;  
  }
   return (fibo(n-1)+fibo(n-2));
}

int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int result=fibo((n)-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<result;
}