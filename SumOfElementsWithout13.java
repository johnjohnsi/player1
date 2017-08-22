package guvi;
import java.util.*;
public class SumOfElementsWithout13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int sum = 0;
		for( int i = 0 ; i < size ; i++ ) {
			if( array[i] == 13 ) {
				break;
			}
			else{
				sum += array[i];
			}
		}
		System.out.println( sum );
		s.close();
	}
}
