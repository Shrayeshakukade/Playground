#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x2,y2,x1=3,y1=4;
  cin>>x2>>y2;
  int x=0,y=0;
  x=(x2-x1);
  y=(y2-y1);
  int hops=x*x+y*y;
  int hop = sqrt(hops);
  cout<<hop;
}