#include<iostream>
using namespace std;

int sinDigit(int n){//772
  int sum=0;
  while(n>0 || sum>9){
  if(n==0){
    n=sum;//84
	sum=0;
   }
	sum=sum+n%10;//0+77//77+7//84+0//0+8//8+0
  	n=n/10;}//77//7//0//8
  return sum;
    
  }
int main(){
	int n;
  cin>>n;
  int result=sinDigit(n);
  cout<<result;
}