package guvi;
import java.util.*;
public class Stringwithoutconcat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the String1 : " );
		String str = s.nextLine();
		System.out.println( "Enter the String2 : " );
		String str1 = s.nextLine();
		System.out.println( str + str1);
		s.close();
	}
}
