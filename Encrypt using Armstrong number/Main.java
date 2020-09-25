#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int div,m=n,result=n,count=0;
  while(n>0){
  	div=n%10;
    if(div!=0){
    	count++;
    }
    n=n/10;
  }
  int sum=0;
  while(m>0){
  	div=m%10;
    sum=sum+pow(div,count);
    m=m/10;
  }
  int flag=0;
  if(result==sum)
    flag=1;
  else
    flag=0;
  return flag;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}