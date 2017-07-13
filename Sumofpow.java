package guvi;
import java.util.*;
public class Sumofpow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the input1 : " );
		int num = s.nextInt();
		System.out.println( "Enter the input2 : " );
		int num1 = s.nextInt();
		int sum = num + num1;
		int mul = 1;
		for( int i = 1 ; i<=sum ; i++ ) {
			mul *=sum;
		}
		System.out.println( "Sum of Power : " + mul );
		s.close();
	}
}
