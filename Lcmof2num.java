package guvi;
import java.util.*;
public class Lcmof2num {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter Two numbers : " );
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int t = 0;
		int lcm = 0;
		int max = 0;
		int min = 0;
		if( num1 > num2 ) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		for( int i = 1 ; i<min ; i++ ) {
			t = max * i;
			if( t % min == 0 ) {
				lcm = t;
				break;
			}
		}
		System.out.println( "L.C.M of two number is " + lcm );
		s.close();
	}
}
