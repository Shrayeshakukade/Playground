#include<iostream>
using namespace std;
int main()
{
	int w,x,y;
	cin>>w>>x>>y;
  	int totCostPerCopy = w*x - w*y - 100;
  	cout<<totCostPerCopy;
}