 import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
     int cols=sc.nextInt();
    int m[][]=new int[rows][cols];
    int m1[][]=new int[rows][cols];
    int m2[][]=new int[rows][cols];
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {  
        m[i][j]=sc.nextInt();
      }
    }
    
     for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {
        m1[i][j]=sc.nextInt();  
      }
    }
      for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
      {
        m2[i][j]=m[i][j]-m1[i][j];
        System.out.print(m2[i][j]+" ");
      }
      System.out.println();
    }
    
    
  }
}