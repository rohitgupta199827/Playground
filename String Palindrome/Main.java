 import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int strlen=str.length();
      String ch="";
      
      
       for(int i=strlen-1;i>=0;i--)
      {
        ch= ch+str.charAt(i);
      }
      if(ch.equals(str))
        System.out.print("Yes");
      else
         System.out.print("No");
    } 
}