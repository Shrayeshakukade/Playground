#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int d=d1+d2;
  int c=c1+c2;
  int cc=0;
  if(c>100 && cc<200){
  	cc = (c-100);
    d = d + 1;
  }
  else if(c<100){
  	cc=c;
  }else{
  	cc=(c-200);
    d=d+2;
  }
  
  cout<<d<<endl<<cc;
}