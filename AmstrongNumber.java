package guvi;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int number = s.nextInt();
	int demoNumber = number;
	int rem = 0;
	int sum = 0;
	while( demoNumber != 0 ) {
		rem = demoNumber % 10;
		sum += ( rem * rem * rem );
		demoNumber /= 10;
	}
	if( number == sum ) {
		System.out.println( "The given number is an amstrong number " );
	}
	else {
		System.out.println( "The given number is an non-amstrong number " );
	}
	s.close();
	}
}
