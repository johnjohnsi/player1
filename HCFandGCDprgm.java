package guvi;
import java.util.Scanner;
public class HCFandGCDprgm {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println( "Enter the two numbers : " );
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int x = num1;
	int y = num2;
	int temp = 0;
	int temp1 = 0;
	while( y != 0 ) {
		temp = y;
		y = x % y;
		x = temp;
	}
	while( num2 != 0 ) {
		temp1 = num1 % num2;
		num1 = num2;
		num2 = temp1;
	}
	System.out.println( "H.C.F of two nuumbers is " + x );
	System.out.println( "G.C.D of two numbers is " + num1 );
	s.close();
}


}
