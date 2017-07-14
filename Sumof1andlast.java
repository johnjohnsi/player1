package guvi;
import java.util.*;
public class Sumof1andlast {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int num = s.nextInt();
		String str = Integer.toString( num );
		char ch [] = str.toCharArray();
		System.out.println( Character.getNumericValue(ch[0])+Character.getNumericValue( ch[ch.length-1] ) );
		s.close();
	}

}
