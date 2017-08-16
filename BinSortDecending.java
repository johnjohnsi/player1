package guvi;
import java.util.*;
public class BinSortDecending {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		Arrays.sort(array);
		for( int i = 0 ; i < size ; i++ ) {
			System.out.println( array[i] );
		}
		s.close();
	}
}
