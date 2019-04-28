  import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
        int arrsiz=sc.nextInt();
      int arr[]=new int[arrsiz];
       for(int idx=0;idx<arrsiz;idx++)
       {
         arr[idx]=sc.nextInt();
       }
   
      int max;
      if(arr[0]>arr[1])
      max=arr[0];
      else
        max=arr[1];
      for(int idx=2;idx<arrsiz;idx++)
      {
        if(arr[idx] > max)
        max=arr[idx];
      }
      
      System.out.println(max);
    }
}