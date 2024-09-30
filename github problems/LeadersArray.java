package FinalYear1;
import java.util.Scanner;
public class LeadersArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<=arr[j]) break;
			}
			if(j==n) System.out.print(arr[i]+" ");
		}
	}

}
