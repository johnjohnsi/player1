package guvi;
import java.util.*;
public class CelToFeh {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Celsius : " );
		int celsius = s.nextInt();
		int fahrenheit = ( celsius * 9/5 ) + 32;
		System.out.println( fahrenheit);
		s.close();
	}
}
