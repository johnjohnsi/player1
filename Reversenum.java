package guvi;

import java.util.Scanner;

public class Reversenum {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int rem=0,temp=0;
		while(num!=0){
			rem=num%10;
			temp=temp*10+rem;
			num/=10;
		}
		System.out.println(temp);
		s.close();
	}

}
