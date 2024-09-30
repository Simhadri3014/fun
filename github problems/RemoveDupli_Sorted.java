package FinalYear1;
import java.util.*;
public class RemoveDupli_Sorted {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int i=0,j=1;
		while(j<n-1)
		{
			if(arr[i]!=arr[j])
			{
				arr[i+1]=arr[j];
				i++;
			}
			j++;
		}
		for(int k=i+1;k<n-1;k++)
		{
			arr[k]=0;
		}
		Arrays.sort(arr);
		for(int m:arr)
		{
		 if(arr[m]!=0)	System.out.println(arr[m]);
		}
		
	}

}
