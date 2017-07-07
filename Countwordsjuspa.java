package guvi;

import java.util.Scanner;

public class Countwordsjuspa {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();
		String[] str1=str.split(" ");
		System.out.println("Count of words in the string : "+str1.length);
		s.close();
		
	}
}
