package guvi;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int pow=s.nextInt();
		int rem=1;
		for(int i=0;i<pow;i++){
			rem*=num;
		}
		System.out.println(rem);
		s.close();
	}
}
