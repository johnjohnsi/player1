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
			System.out.println(input.replace(ch, "*")+input.substring(positionMiddle+1));
		}
		else {
			System.out.println(input.substring(0,input.length()/2) + "*" + input.substring(input.length()/2,input.length()));
		}
		s.close();
	}
}
