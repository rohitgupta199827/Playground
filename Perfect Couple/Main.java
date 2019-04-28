  import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int idx=0;idx<n;idx++)
  {
    arr[idx]=sc.nextInt();   
  }
  int value=sc.nextInt();
  
for(int idx1=0;idx1<n;idx1++)
{
  for(int idx2=idx1+1;idx2<n;idx2++)
  {
    int temp=(arr[idx1]+arr[idx2]);
    if((arr[idx1]+arr[idx2])==value)
    {
      System.out.println(arr[idx1]+", "+arr[idx2]);
    }
  }
// if((arr[idx1]+arr[idx2])==value)
  //  System.out.print("\n");
 // else
  //  break;
}

}
}
