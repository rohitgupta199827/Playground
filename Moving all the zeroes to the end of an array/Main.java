 import java.util.Scanner;
class Main{
  public static void pushzerotoend(int arr[],int n)
  {
    int count=0;
    for(int idx=0;idx<n;idx++)
    {
      if(arr[idx]!=0)
      {
        arr[count++]=arr[idx];
        System.out.print(arr[idx]+" ");
      }
    }
      for(int idx=0;idx<n-count;idx++)
      {
        System.out.print(0+" ");
      }
     
    
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int idx=0;idx<n;idx++)
      {
        arr[idx]=sc.nextInt();
      }
      pushzerotoend(arr,n);
     
    }
}
