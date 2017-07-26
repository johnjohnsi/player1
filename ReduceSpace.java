package guvi;
import java.util.*;
public class ReduceSpace {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input : " );
		String input = s.nextLine();
		System.out.println( input.replaceAll( "\\s{2,}", " " ) );
		s.close();
	}
}
