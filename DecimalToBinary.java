package guvi;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		System.out.println( Integer.toBinaryString( decimal ) );
		s.close();
	}
}
