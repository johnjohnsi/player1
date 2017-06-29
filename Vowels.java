package guvi;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("The given character is vowel");
		}
		else{
			System.out.println("The given character is Consonent");
		}
		s.close();
	}
}
