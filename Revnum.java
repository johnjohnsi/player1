package guvi;

import java.util.Scanner;

public class Revnum {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int rem=0;
		int rev=0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("reverse of given number : "+rev);
		s.close();
	}

}
