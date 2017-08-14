package guvi;
import java.util.*;
public class MultipleStringAsNumber {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		int number = Integer.parseInt(input1) * Integer.parseInt(input2);
		System.out.println( Integer.toString( number ) );
		s. close();
	}
}
