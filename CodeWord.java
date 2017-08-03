package guvi;
import java.util.*;
public class CodeWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String input1 = s.next();
		input1 = input1.toLowerCase();
		System.out.println( "Enter the Input2 : " );
		String input2 = s.next();
		int number[] = new int[input1.length()];
		for( int i = 0 ; i < input1.length(); i++ ) {
			char input1Char = input1.charAt(i);
			if( input1Char >= 'a' && input1Char <= 'z') {
				number[i] = ( int ) input1Char - 'a' + 1;
			}
			System.out.print( Character.toString( ( char )( number[i] + 96 + 10 ) ) );
		}
		System.out.print( " " );
		int number2 [] = new int[input2.length()];
		int number3[] = new int[input2.length()];
		for( int i = 1 ; i < input2.length()-1 ; i++ ) {
			char input2Char = input2.charAt(i);
			if( input2Char >= 'a' && input2Char <= 'p' ) {
				number2[i] = ( int ) input2Char - 'a' + 1;
			}
			if( input2Char >= 'q' && input2Char <= 'z' ) {
				number3[i] = ( int ) input2Char - 'q' + 1;
			}
			if( number2[i] != 0 ) {
			System.out.print(input2.charAt(0) + Character.toString( ( char )( number2[i] + 96 + 10 ) ) );
			}
			if( number3[i] != 0 ) {
				System.out.print( Character.toString( ( char )( number3[i] + 96 ) ) + input2.charAt(input2.length()-1) );
			}
		}
		s.close();
	}
}
