package guvi;
import java.util.*;
public class NumberOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int count = 0 ;
		for( int i = 0 ; i < input.length() ; i++ ) {
			if(input.charAt(i)== '0' || input.charAt(i)== '1' || input.charAt(i)== '2' ||  input.charAt(i)== '3' || input.charAt(i)== '4' || input.charAt(i)== '5' || input.charAt(i)== '6' || input.charAt(i)== '7' || input.charAt(i)== '8' ||input.charAt(i)== '9' || input.charAt(i)== '.' || input.charAt(i)== 'e') {
				count = 0;
			}
			else{
				count++;
			}
		}
		if(count > 0 ) {
			System.out.println( "False" );
		}
		else {
			System.out.println( "True" );
		}
		s.close();
	}
}
