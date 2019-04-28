import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num,row=1;
        num=1;
      for( row=1;row<=n;row++)
  { 
       
          for(int col=1;col<=((n-row));col++)
    {
      System.out.print(" ");
       
    }
    for(int col=1;col<=((row));col++)
    {
      System.out.print(num+" ");
       num=num+1;
    }
         System.out.print("\n");
        
      }
    }    
}