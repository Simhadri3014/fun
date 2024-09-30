package FinalYear1;
import java.util.*;
public class Valid_Anagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println(valid_Anagram(s1,s2));
	}

	private static boolean valid_Anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		char[] s1char=s1.toCharArray();
		char[] s2char=s2.toCharArray();
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		return Arrays.equals(s1char, s2char);
	}

}
