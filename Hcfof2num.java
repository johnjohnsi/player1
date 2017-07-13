package guvi;
import java.util.*;
public class Hcfof2num {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the two numbers : " );
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int x = num1;
		int y = num2;
		int temp = 0;
		while( y != 0 ) {
			temp = y;
			y = x % y;
			x = temp;
		}
		System.out.println( "H.C.F of two nuumbers is " + x );
		s.close();
	}

}
