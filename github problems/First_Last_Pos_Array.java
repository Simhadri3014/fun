package FinalYear1;
import java.util.*;
public class First_Last_Pos_Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0,n=s.nextInt();
		int target=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==target)
			{
				System.out.print(i+" ");
				count++;
				break;
			}
		}
		for(int i=n-1;i>0;i--)
		{
			if(arr[i]==target)
			{
				System.out.print(i);
				count++;
				break;
			}
		}
		if(count==0) System.out.println("[-1,-1]");	
	}

}
