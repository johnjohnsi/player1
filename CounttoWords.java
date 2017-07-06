package guvi;

import java.util.Scanner;

public class CounttoWords {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		System.out.println("The number of words in the given string : "+str1.length);
		s.close();
	}

}
