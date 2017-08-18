package guvi;
import java.util.*;
public class MiddleStarString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int positionMiddle = 0;
		if( input.length() % 2 != 0 ) {
			positionMiddle = input.length()/2;
			String ch = input.substring(positionMiddle);
			StringBuffer SubStringReverse = new StringBuffer(input.replace(ch, "*")+input.substring(positionMiddle+1)).reverse();
			System.out.println(SubStringReverse);
		}
		else {
			StringBuffer SubStringReverse = new StringBuffer(input.substring(0,input.length()/2) + "*" + input.substring(input.length()/2,input.length())).reverse();
			System.out.println(SubStringReverse);
		}
		s.close();
	}
}
