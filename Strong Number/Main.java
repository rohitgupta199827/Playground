import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n;
      int sum=0,r;
      while(n>0)
      {
        int fact=1;
        r=n%10;
        int i=1;
        while(i<=r)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        n=n/10;
      }
      if(temp==sum )
      {
        System.out.print("Yes");
      }
      else
       { 
        System.out.print("No");
	   }
    }
}