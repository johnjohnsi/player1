package guvi;
import java.util.*;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String binaryInput = s.nextLine();
		System.out.println(Integer.parseInt( binaryInput,2));
		s.close();
	}
}
