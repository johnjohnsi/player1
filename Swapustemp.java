package guvi;

import java.util.Scanner;

public class Swapustemp {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		int num=s.nextInt();
		System.out.println("Enter teh number2 : ");
		int num1=s.nextInt();
		int temp=0;
		temp=num;
		num=num1;
		num1=temp;
		System.out.println("After swap two numbers : "+num+" "+num1);
		s.close();
	}
}
