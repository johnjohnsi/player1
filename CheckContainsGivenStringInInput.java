package guvi;
import java.util.*;
public class CheckContainsGivenStringInInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		char initial = input2.charAt(0);
		if(input1.contains(input2)) {
			for( int i = 0 ; i < input1.length() ; i++ ) {
				if(input1.charAt(i) == initial) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("-1");
		}
		s.close();
	}
}
