package guvi;
import java.util.*;
public class Alpnumnotascii {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input : " );
		int num = s.nextInt();
		System.out.println( Character.toString ( ( char ) ( num+64 ) ) );
		s.close();
	}
}
