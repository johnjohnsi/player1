package guvi;
import java.util.*;
public class SumofPrime {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the input : " );
		int num = s.nextInt();
		int sum = 0;
		int flag = 0 ;
		for( int i = 2 ; i<=num ; i++ ) {
			for( int j = 2 ; j<i ;j++ ) {
				if( i%j == 0 ) {
					flag = 1;
					break;
				}
				else {
					flag = 0;
				}
			}
		if(flag == 0) {
			sum +=i;
		}
		}
		System.out.println(sum);
		s.close();
	}
}
