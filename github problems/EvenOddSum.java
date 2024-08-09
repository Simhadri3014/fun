import java.io.IOException;
import java.util.Scanner;
public class EvenOddSum
{
  @SuppressWarnings("resource")
  public static void main(String[] args) throws IOException
   {
    Scanner s=new Scanner(System.in);
    long num=s.nextLong();
    int evenSum=0;
    int oddSum=0;
    int brr[]=evenOddSum(num,evenSum,oddSum);
    System.out.println(brr[0]+" ");
    System.out.print(brr[1]);
   }
 public static int[] evenOddSum(long num,int evenSum,int oddSum)
  {
   int[] arr=new int[2];
   while(num>0)
    {
     long digit=num%10;
     if(digit%2==0)
     {
       evenSum+=digit;
     }
     else
     {
       oddSum+=digit;
     }
     num=num/10;
    }
   arr[0]=evenSum;
   arr[1]=oddSum;
   return arr;
  }
}