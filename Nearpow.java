package logic;

import java.util.Scanner;

public class Nearpow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println( "Enter the number" );
		int num = s.nextInt();
		String str = Integer.toString( num );
		char ch;
		char ch1;
		int sum = 0;
		int mul;
		int rem = 1;
		char ch2 = str.charAt(0);
		char ch3 = str.charAt(str.length()-1);
		for( int i = 0 ; i < Character.getNumericValue( ch2 ) ; i++ ) {
			rem *= Character.getNumericValue(ch3);
		}
		for( int i = 0 ; i < str.length() - 1 ; i++ ) {
			ch = str.charAt(i);
			ch1 = str.charAt(i+1);
			mul = 1;
			for( int j = 0 ; j < Character.getNumericValue(ch1) ; j++ ) {
				mul *= Character.getNumericValue(ch);
			}
			sum += mul;
		}
		System.out.println( "Output : " + ( sum + rem ) );
		s.close();
	}
}
