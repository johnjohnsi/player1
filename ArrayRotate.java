package guvi;
import java.util.*;
public class ArrayRotate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		for( int i = 0 ; i < size ; i++ ) {
			array[i] = s.nextInt();
		}
		int size2 = size-size/2;
		int array1[] = new int[size/2];
		int array2[] = new int[size2];
		for( int i = 0 ; i < size/2 ; i++ ) {
			array1[i] = array[i];
		}
		int l = 0;
		System.out.println();
		for( int i = size/2 ; i < size ; i++ ) {
			array2[l] = array[i];
			l++;
		}
		int j = 0;
		for( int i = size2-1 ; i > 0 ; i-- ) {
			System.out.print(array2[i] + " " );
			System.out.print(array1[j] + " " );
			j++;
		}
		System.out.println( array2[0]);
		s.close();
	}
}
