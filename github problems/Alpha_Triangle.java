package FinalYear1;
import java.util.*;
public class Alpha_Triangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<=N;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char ch=((char) (65+N-j));
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
