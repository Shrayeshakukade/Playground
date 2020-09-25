#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,d3,d4,d5,d6,d7,s=0;
  cin>>d1>>d2>>d3>>d4>>d5>>d6>>d7;
  s=s+d1*150;//d1=sunday
  if(d2>8){
  	s=s+(d2-8)*115;
    s=s+8*100;
  }
  else{
  	s=s+d2*100;
  }if(d3>8){
  	s=s+(d3-8)*115;
    s=s+8*100;
  }
  else{
  	s=s+d3*100;
  }if(d4>8){
  	s=s+(d4-8)*115;
    s=s+8*100;
  }
  else{
  	s=s+d4*100;
  }if(d5>8){
  	s=s+(d5-8)*115;
    s=s+8*100;
  }
  else{
  	s=s+d5*100;
  }if(d6>8){
  	s=s+(d6-8)*115;
    s=s+8*100;
  }
  else{
  	s=s+d6*100;
  }
  int tot=d2+d3+d4+d5+d6;
  if(tot>40){
  	s=s+(tot-40)*125;
  }
  s=s+d7*125;//d7=saturday
  cout<<s;
}
