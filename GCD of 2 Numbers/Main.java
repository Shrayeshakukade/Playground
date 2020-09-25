#include<iostream>
using namespace std;

int gcd(int a,int b){//43,34//34,14//14,4//4,3//3,1//1,3
	if(b==0)
      return a;
  	else
      return gcd(b,a%b);//34,43%34=14//14,34%14=4//4,14/4=3//3,4/3=1//1,3/1
}
	

int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  int res = gcd(a,b);//43,34
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<res;
}