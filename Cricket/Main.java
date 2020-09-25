#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
  int totBall,totRun,scoredRun,bawledBall;
  cin>>totBall>>totRun>>scoredRun>>bawledBall;
  int totOver = totBall/6;
  cout<<totOver<<endl;
  int n=bawledBall/6;
  int p=bawledBall%6;
  float finishOver = ((float)n + (float)p/10);
  cout<<fixed<<setprecision(1)<<finishOver<<endl;
  float rateRun = scoredRun/finishOver;
  cout<<rateRun<<endl;
  float totRateRun = ((float)totRun)/((float)totOver);
  cout<<totRateRun<<endl;
  if(rateRun>totRateRun)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";

}