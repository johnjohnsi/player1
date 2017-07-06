package guvi;

import java.util.Scanner;

public class sumofn {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int n=0;
		for(int i=0;i<=num;i++){
			n+=i;
		}
		System.out.println("sum of n : "+n);
		s.close();
	}

}
