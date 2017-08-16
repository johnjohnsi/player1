package guvi;
import java.util.*;
public class ConvertPositiveNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		 if( input.contains("-") ) {
			 int number = Integer.parseInt(input);
			 System.out.println(-(number));
			 }
		 else {
			 System.out.println("-1");
			 }
		 s.close();
	}
}
