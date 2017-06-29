package guvi;

import java.util.Scanner;

public class Palnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		String str=Integer.toString(num);
		StringBuffer str1=new StringBuffer(str).reverse();
		if(str1.toString().equals(str)){
			System.out.println("The given number is palindrom");
		}
		else{
			System.out.println("The given number is not palindrom");
		}
		s.close();
	}
}
