package guvi;

import java.util.Scanner;

public class InbetPrime {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int num=s.nextInt();
		System.out.println("Enter the ending number");
		int num1=s.nextInt();
		int flag;
		for(int i=num;i<num1;i++){
			flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i);
			}
			s.close();
		}
	}
}
