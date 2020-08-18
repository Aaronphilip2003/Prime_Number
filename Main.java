import java.io.*;
public class Main
 {
   public static void main(String args[])throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int count=0, a=0,b=0;int i=0;
     System.out.println("Enter the Lower bound:");
     a=Integer.parseInt(br.readLine());
     System.out.println("Enter the Upper Bound");
     b=Integer.parseInt(br.readLine());
     for(i = a; i <= b; i++)
      {
         count=0;
    for(int j = 1; j <= i; j++)
     {
    if(i % j == 0)
     count ++;
    }
    if(count==2)
   System.out.println(i);
   }
   

   }
 }