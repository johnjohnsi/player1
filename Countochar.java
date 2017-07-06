package guvi;

import java.util.Scanner;

public class Countochar {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		String[] str1=str.split("");
		System.out.println(str1.length);
		s.close();
	}

}
