import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    	Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int starcount = 1 ; starcount <= n ; starcount++) {
			System.out.print(starcount);
			if((starcount % 3 == 0) && (starcount != n))
    			System.out.print(",");			
		}
  }
}