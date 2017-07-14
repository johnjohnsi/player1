package guvi;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DupTwostrtrfal {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String str = s.nextLine();
		int l = str.length();
		char ch [] = str.toCharArray();
		int count = 0;
		System.out.println( "Enter the input2 : " );
		String str1 = s.nextLine();
		int l1 = str1.length();
		char ch1 [] = str1.toCharArray();
		int count1 = 0;
		Set<Character> dup = new TreeSet<Character>();
		for( int i = 0 ; i<l ; i++ ) {
			dup.add( ch[i] );
		}
		Iterator<Character> itr = dup.iterator();
		while( itr.hasNext() ) {
			itr.next();
			count++;	
		}
		int flag = 0;
		if( count == l) {
			flag++;
		}
		Set<Character> dup1 = new TreeSet<Character>();
		for( int i = 0 ; i<l1 ; i++ ) {
			dup1.add( ch1[i] );
		}
		Iterator<Character> itr1 = dup1.iterator();
		while( itr1.hasNext() ) {
			itr1.next();
			count1++;
		}
		if( count1 == l1 ) {
			flag++;
		}
		if( flag == 0 ) {
			System.out.println( "True" );
		}
		else{
			System.out.println( "False" );
		}
		s.close();
	}
}
