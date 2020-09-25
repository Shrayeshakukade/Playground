#include<iostream>
using namespace std;
int main(){
int n1,n2;
  cout<<"Enter first number : Enter second number : Menu"<<endl;
    cin>>n1>>n2;

  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder"<<endl;
    int choice;
  cin>>choice;
  switch(choice){
    case 1:
      cout<<(n1+n2);
      break;
  case 2:
      cout<<(n1-n2);
      break;
  case 3:
      cout<<(n1*n2);
      break;
  case 4:
      cout<<(n1/n2);
      break;
  case 5:
      cout<<(n1%n2);
      break;
    default:
      cout<<"Invalid operation";
  
  }
}