package guvi;
import java.util.*;
public class LogicExceptedOutput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String input1 = s.nextLine();
		String number = "";
		int max = -1234;
		int min = 1234;
		int rem = 0 ;
		int mul = 0;
		for( int i = 0 ; i < input1.length() ; i++ ) {
			if(input1.charAt(i) >= '0' && input1.charAt(i) <= '9') {
				number += Character.getNumericValue( input1.charAt( i ) );
			}
		}
		int toNumber = Integer.parseInt( number );
		int lar = toNumber;
		int temp = toNumber;
		while( lar != 0 ) {
			rem = lar %10;
			if( rem > max ) {
				max = rem;
			}
			if( rem < min ) {
				min = rem;
			}
			lar /= 10;	
		}		
		while( toNumber != 0 ) {
			rem = toNumber % 10;
			mul += max * rem;
			toNumber /= 10;
			}
		int sum = 0;
		if( mul > 10 ) {
			while( mul != 0) {
				rem = mul % 10;
				sum += rem;
				mul /= 10;
			}
		}
		int sum1 = 0;
		if( sum >= 10 ) {
			while( sum != 0 ) {
				rem = sum % 10;
				sum1 +=rem;
				sum /= 10;
			}
		}
		else {
			System.out.println( sum );
		}
		int sum2 = 1;
		while( temp != 0 ) {
			rem = temp % 10;
			sum2 *=min+rem;
			temp /= 10;
		}
		int sum3 = 0;
		if( sum2 >= 10 ) {
			while( sum2 != 0 ) {
				rem = sum2 % 10;
				sum3 += rem;
				sum2 /= 10;
			}
		}
		else {
			System.out.println(sum2);
		}
		if( sum1 > sum3 ) {
			System.out.println( "Expected Output is : " + sum3 * sum3 );
		}
		else {
			System.out.println( "Expected Output is : " + sum1 * sum1 );
		}
		s.close();
	}
}
