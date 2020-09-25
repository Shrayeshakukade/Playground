#include<iostream>
#include<math.h>
using namespace std;
int main(){
	int n;
  cin>>n;
  int start=11;
  int add=4;
  for(int i=0;i<n;i++){
    int seq=pow(start,2);
  	cout<<seq<<" ";
    start = start+add;
  }
}