package guvi;
import java.util.*;
public class MultipleOfTwoString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String input1 = s.nextLine();
		int number1 = Integer.parseInt( input1 );
		System.out.println( "Enter the Input2 : " );
		String input2 = s.nextLine();
		int number2 = Integer.parseInt( input2 );
		int number3 = number1 * number2;
		String output = Integer.toString( number3 );
		System.out.println( "Output : " + output );
		s.close();
	}
}
