import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int num,row=1;
        num=row;
      for( row=1;row<=n;row++)
  { 
       
    for(int col=1;col<=((n-row));col++)
    {
      System.out.print(" ");
      
    }
    for(int col=1;col<=(((num)));col++)
    {
      System.out.print("*");
      
    }
     
    System.out.print("\n");
        num=num+2;
    
  }
	}
}