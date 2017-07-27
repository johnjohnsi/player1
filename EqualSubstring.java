package guvi;
import java.util.*;
public class EqualSubstring {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the Input1 : " );
		String input1 = s.nextLine();
		System.out.println( "Enter the Input2 : " );
		String input2 = s.nextLine();
		String substringInput1 = " "; 
		for( int i = 0 ; i < input1.length(); i++ ) {
			for( int j = 0 ; j <= input1.length()-i ; j++ ) {
				substringInput1 += " " + input1.substring( i , i + j );
			}
		}
		String splitString1[] = substringInput1.split(" ");
		String substringInput2 = " ";
		for( int i = 0 ; i < input2.length() ; i++ ) {
			for( int j = 0 ; j <= input2.length()-i ; j++ ) {
				substringInput2 += " " + input2.substring( i , i + j );
			}
		}
		String splitString2[] = substringInput2.split(" ");
		int max = -123;
		String output1 = "";
		String output = "";
		for( int i = 0 ; i < splitString1.length ; i++ ) {
			for( int j = 0 ; j <splitString2.length ; j++ ) {
			if( splitString1[i].equals( splitString2[j] ) ) {
				output = splitString1[i];
				if(output.length()!=0){
					if(output.length()>max){
						max = output.length();
						output1 = output;
					}
				}
			}
			}
		}
		System.out.println( output1);
		s.close();
	}
}
