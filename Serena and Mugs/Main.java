import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int mug[] = new int[n];
    
    for(int i=0;i<n;i++){
    	mug[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0;i<n;i++){
    	sum += mug[i];
    }
    if(sum <= c)
       	System.out.println("YES");
	else
      	System.out.println("NO");
}
}