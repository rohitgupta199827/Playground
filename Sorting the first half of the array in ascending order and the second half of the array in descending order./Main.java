 import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr,0,(n/2));
    for(int i=(n/2);i<n-1;i++)
    {
     for(int j=(n/2);j<(n-1);j++)
     {
       if(arr[j]<arr[j+1])
       {
         int temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
       }
     }
    }
     for(int i=0;i<n;i++)
     {
       System.out.print(arr[i]+" ");
     }
  }
}