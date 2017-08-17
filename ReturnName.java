package guvi;
import java.util.*;
public class ReturnName {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		String title = s.next();
		System.out.println( title + "," + name.substring(0,1) );
		s.close();
	}
}
