 import java.util.*;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
 // float n=Float.parseFloat(str);
  //or
  float n=Float.valueOf(str);
  /*float len=str.length();
  float n=0;
   for(int i=0;i<len;i++)
   {
     if((str.charAt(i))>=48 && (str.charAt(i)<=57))
     {
       n=(n*10)+(str.charAt(i)-48);
     }
   }
   */
  System.out.print(n+"00000");
}
}
