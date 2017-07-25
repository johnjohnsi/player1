package logic;
import java.util.*;
public class UsreIdGeneration {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String input1 = s.nextLine();
		System.out.println( "Enter the Input2 : " );
		String input2 = s.nextLine();
		System.out.println( "Enter the Size of the PIN Number : " );
		int pinSize = s.nextInt();
		String output1 = "";
		System.out.println( "Enter thePIN number : " );
		int pinNumber [] = new int[pinSize];
		for( int i = 0 ; i < pinSize ; i++ ) {
			pinNumber[i] = s.nextInt();
		}
		System.out.println( "Enter the Position : " );
		int position = s.nextInt();
		String highestString = "";
		String leastString = "";
		if( input1.length() > input2.length() ) {
			System.out.print( input1.substring( 0 , 1 ) + input2 );
		}
		else if( input1.length() < input2.length() ) {
			System.out.print( input2.substring( 0 , 1 ) + input1 );
		}
		else{
			String arr[] ={input1,input2};
			Arrays.sort(arr);
			for( int i = 0 ; i < arr.length ; i++ ) {
				highestString = arr[0];
				leastString = arr[1];
			}
			output1 = highestString.substring(0,1) + leastString;
		}
		System.out.print( output1+pinNumber[position-1]+pinNumber[pinSize-position] );
		s.close();

	}

}
