#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int add=4,start=11;
  for(int i=0;i<n;i++){
  	int seq=pow(start,2);
    start=start+add;
    cout<<seq<<" ";
  	}
}