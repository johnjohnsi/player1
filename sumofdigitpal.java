package guvi;

import java.util.Scanner;

public class sumofdigitpal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n=num;
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		int temp=sum;
		int rem=0;
		while(temp!=0){
			rem=rem*10+temp%10;
			temp/=10;
		}
		if(sum==rem){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not palindrom");
		}
		s.close();

	}

}
