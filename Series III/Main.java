#include<iostream>
#include<math.h>
using namespace std;
int main(){
	int n;
  cin>>n;
  int add=5,seq=6;
  for(int i=0;i<n;i++){
    seq=seq+add*i;
    cout<<seq<<" ";

  }
}