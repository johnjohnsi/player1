package guvi;
import java.util.*;
public class Greatestof3num {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int num1 = s.nextInt();
		System.out.println( "Enter the Input2 : " );
		int num2 = s.nextInt();
		System.out.println( "Enter the Input3 : " );
		int num3 = s.nextInt();
		if( num1 > num2 && num1 >num3 ) {
			System.out.println( num1 + " is the largest number." );
		}
		if( num2 > num1 && num2 >num3 ) {
			System.out.println( num2 + " is the largest number." );
		}
		if( num3 > num2 && num3 >num1 ) {
			System.out.println( num3 + " is the largest number." );
		}
		s.close();
	}
}
