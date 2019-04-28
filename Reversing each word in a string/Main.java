  import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split(" ");
    String rev_string="";
    for(int i=0;i<arr.length;i++)
    {  
      String word=arr[i];
      String rev_word="";
      for(int k=(word.length())-1;k>=0;k--)
        {
          rev_word=rev_word+word.charAt(k);
        }
      rev_string=rev_string+rev_word+" ";
    }
    System.out.println(rev_string);
  }
}