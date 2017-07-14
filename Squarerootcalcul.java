package john;
import java.util.*;
public class Squarerootcalcul {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter X1 : " );
		int x1 = s.nextInt();
		System.out.println( "Enter X2 : " );
		int x2 = s.nextInt();
		System.out.println( "Enter Y1 : " );
		int y1 = s.nextInt();
		System.out.println( "Enter Y2 : " );
		int y2 = s.nextInt();
		int num =  ( x1 + x2 ) * ( x1 + x2 ) + ( y1 + y2 ) * ( y1 + y2 );
		System.out.println( num );
		s.close();
	}
}
