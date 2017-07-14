package guvi;
import java.util.*;
public class SumandMulofgivnum {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int num = s.nextInt();
		int rem = 0;
		int sum = 0;
		while( num!=0 ) {
			rem = num % 10;
			sum += rem * rem;
			num /= 10;
		}
		System.out.println( "Output : " + sum );
		s.close();
	}
}
