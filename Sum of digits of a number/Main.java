import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int num,sum=0,digit;
      while(n > 0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
      System.out.print(sum);
      
	}
}