 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s1=sc.nextLine();
    StringBuilder sb=new StringBuilder(s);
    StringBuilder sb1=new StringBuilder(s1);
    int n=sb.length();
    int m=sb1.length();
    
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(sb1.charAt(i)==sb.charAt(j))
        {
          sb.setCharAt(j,'@');
        }
      }
    }
       for(int j=0;j<n;j++)
       {
       if(sb.charAt(j)!='@')
       {
         System.out.print(sb.charAt(j));
       }
       }
  }
}