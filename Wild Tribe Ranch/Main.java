#include<iostream>
using namespace std;
int main(){
	int wt,wtFlo;
  cin>>wt>>wtFlo;
  if(wt>wtFlo)
    cout<<"Yes, you can enter.";
  else if(wt==wtFlo)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter"; 
}