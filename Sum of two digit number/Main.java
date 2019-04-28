 import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=(a*10)/100;
      int c=(a%10);
      int d=c+b;
  
      System.out.println(d);
	}
}