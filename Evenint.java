package guvi;

import java.util.Scanner;

public class Evenint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int num=s.nextInt();
		System.out.println("Enter the ending number");
		int num1=s.nextInt();
		int n[]=new int[100];
		for(int i=num;i<=num1;i++){
			if(i%2==0){
				n[i]=i;
			}
		}
		for(int j=0;j<n.length;j++){
			if(n[j]!=0){
		System.out.println(n[j]);
			}
		}
		s.close();


	}

}
