#include <iostream>
using namespace std;
int main() 
{

  int n;
  int lDigit=0;
  int reverse=0;
	cin>>n;
while(n>0){
  lDigit=n%10;
  //cout<<lDigit<<endl;
  reverse=(reverse*10)+lDigit;
  //cout<<reverse<<endl;
  n=n/10;
  //cout<<n<<endl;
}
  cout<<reverse;
  return 0;
}