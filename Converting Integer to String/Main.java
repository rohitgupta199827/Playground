import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
  int p=n;
  if(n<0)
  {
    n=-n;
  }
 int temp=n;
  int count=0;
  while(n>0)
  {
    count++;
    n=n/10;
  }
  char str[]=new char[count];
  for(int i=count-1;i>=0;i--)
  {
    char ch=(char)((temp%10)+'0');
    str[i]=ch;
    temp=temp/10;
  }
  if(p>0)
  {
  for(int i=0;i<count;i++)
  {
  System.out.print(str[i]);
  }
  }
  else
  {
    System.out.print("-");
   for(int i=0;i<count;i++)
  {
  System.out.print(str[i]);
  }
  }
    
}
}
