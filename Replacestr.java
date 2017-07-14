package guvi;
import java.util.*;
public class Replacestr {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String str = s.nextLine();
		String str2 = str.replaceAll("[ise]","");
		System.out.println(str2);
		s.close();
	}
}
