package guvi;

import java.util.Scanner;

public class Alpha {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
			System.out.println("The given character is an alphabet");
		}
		else{
			System.out.println("The given character is not an alphabet");
		}
		s.close();
	}

}
