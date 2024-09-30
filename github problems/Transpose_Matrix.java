package FinalYear1;
import java.util.*;
public class Transpose_Matrix {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int rowsize=s.nextInt();
		int colsize=s.nextInt();
		int[][] arr=new int[rowsize][colsize];
		//int[][] brr=new int[rowsize][colsize];
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
		    {
				arr[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<colsize;j++)
		    {
				System.out.print(arr[j][i]+" ");
		    }
			System.out.println();
		}
		
	}

}
