  import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner sc = new Scanner(System.in);
	    String n = sc.nextLine();
    String[] words=n.split(" ");
    for(int i=0;i<words.length;i++)
    {   
      if(words[i]!=null)
      {
      for(int j=i+1;j<words.length;j++)
      {
        if(words[i].equals(words[j]))
        {
          words[j]=null;
        }
      }
    }
    }
    
    for(int p=0;p<words.length;p++)
    {
      if(words[p]!=null)
      {
      System.out.print(words[p]+" ");
      }  
      }
  }
}