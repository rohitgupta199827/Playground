   import java.util.*;
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
       int ele1=sc.nextInt();
      int ele2=sc.nextInt();
      int d=0;
      int count=-1;
        for(int idx=0;idx<arrsiz;idx++)
      {
           count++;
         if(arr[idx]==ele1)
         {d=1;
           break;
         }
          
      }
      if(d==1)
      System.out.println(count);
      else
        System.out.println("-1");
      int e=0;
      int c=-1;
        for(int idx=0;idx<arrsiz;idx++)
      {
           c++;
         if(arr[idx]==ele2)
         {e=1;
           break;
         }
      }
       if(e==1)
      System.out.println(c);
      else
      { System.out.print("-1");}
      
      //System.out.println(c);
      
      
      
    }
}
    