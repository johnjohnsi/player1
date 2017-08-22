package guvi;
import java.util.*;
public class RandomNumberPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random input = new Random();
		for( int i = 0 ; i < 10 ; i++ ) {
			System.out.println( input.nextInt(100));
		}
		s.close();
	}
}
