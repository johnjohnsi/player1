package guvi;
import java.util.*;
public class FindEvenNumberWithoutArithmeticOperations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if( (input & 1) == 0 ) {
			System.out.println( "The Given Input is Even" );
		}
		else {
			System.out.println( "The Given Input is Odd" );
		}
		s.close();
	}
}
