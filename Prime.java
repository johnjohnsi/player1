package guvi;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int m=num/2;
		int flag=0;
		for(int i=2;i<m;i++){
			if(num%i==0){
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("The given number is prime");
		}
		else{
			System.out.println("The given number is not a prime");
		}
		s.close();

	}

}
