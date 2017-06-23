package guvi;

import java.util.Scanner;

public class countinteg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n=num;
		int count=0;
		while(n!=0){
			count++;
			n/=10;
		}
		System.out.println("count of an integer is :"+" "+count);
		s.close();

	}

}
