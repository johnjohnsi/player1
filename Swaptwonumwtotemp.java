package guvi;
import java.util.*;
public class Swaptwonumwtotemp {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		int num = s.nextInt();
		System.out.println( "Enter the Input2 : " );
		int num1 = s.nextInt();
		num = num + num1;
		num1 = num - num1;
		num = num - num1;
		System.out.println( "After swap : " );
		System.out.println( "Input1 : " + num );
		System.out.println( "Input2 : " + num1 );
		s.close();
	}

}
