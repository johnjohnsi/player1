package guvi;
import java.util.*;
public class BraveWarriorKabali {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int array1[] = new int[2];
		int array2[] = new int[2];
		int array3[] = new int[2]; 
		for( int i = 0 ; i < 2 ; i++ ) {
			array1[i] = s.nextInt();
		}
		for( int i = 0 ; i < 2 ; i++ ) {
			array2[i] = s.nextInt();
		}
		for( int i = 0 ; i < 2 ; i++ ) {
			array3[i] = s.nextInt();
		}
		System.out.println( Math.abs(array1[0] - array1[1]) );
		System.out.println( Math.abs(array2[0] - array2[1]) );
		System.out.println( Math.abs(array3[0] - array3[1]) );
		s.close();
	}
}
