package guvi;
import java.util.*;
public class SwapUsingBitwiseOperator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input1 = s.nextInt();
		int input2 = s.nextInt();
		System.out.println( "Before Swap " );
		System.out.println( "Input1 : " + input1 + " " + " Input2 : " + input2 );
		input1 = input1 ^ input2;
		input2 = input1 ^ input2;
		input1 = input1 ^ input2;
		System.out.println( "After Swap " );
		System.out.println( "Input1 : " + input1 + " " + " Input2 : " + input2 );
		s.close();
	}
}
