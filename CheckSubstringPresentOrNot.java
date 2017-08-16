package guvi;
import java.util.*;
public class CheckSubstringPresentOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		if(input2.contains(input1)) {
			System.out.println( input1 + " is the substring of " + input2 );
		}
		else{
			System.out.println( input1 + " is not the substring of " + input2 );
		}
		s.close();
	}
}
