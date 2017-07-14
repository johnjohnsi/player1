package john;
import java.util.*;
public class Evenoddsumreturn {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int num = s.nextInt();
		int rem = 0;
		int sum = 0;
		while( num != 0 ) {
			rem = num % 10;
			if( rem % 2 != 0 ) {
				sum += rem;
			}
			num /= 10;
		}
		if( sum % 2 != 0 ) {
			System.out.println( "1-" );
		}
		else {
			System.out.println( "-1" );
		}
		s.close();
	}
}
