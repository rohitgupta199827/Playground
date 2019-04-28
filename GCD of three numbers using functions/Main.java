import java.util.Scanner;
public class Main{
  public static void main(String[] args)
  {
	 Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
     int a= gcd(n1,n2,n3);
    System.out.print(a);
	}
  public static int gcd(int n1,int n2,int n3)
  {
    int min=0,gcd=0;
    if((n1<n2)&&(n1<n3))
    {
      min=n1;
      //System.out.print(n1);
    }
    else if((n2<n1)&&(n2<n3))
    {
      min=n2;
      //System.out.print(n2);
    }
    else if((n3<n1)&&(n3<n2))
    {
      min=n3;
      //System.out.print(n3);
    }
    else
       System.out.print("error");

  while(min>=1)
  {
    if((n1%min==0) && (n2%min==0) && (n3%min==0))
    {
      gcd=min;
      break;
    }
    min--;
  }
    return gcd;
  }
  }